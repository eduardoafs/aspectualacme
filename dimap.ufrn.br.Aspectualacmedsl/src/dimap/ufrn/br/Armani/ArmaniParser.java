package dimap.ufrn.br.Armani;

import java.util.List;

/**
 * Armani parser
 * 
 * @author Eduardo 
 * Part of AspectualACME Studio
 * http://www.dimap.ufrn.br/aspectualacmestudio
 */
public class ArmaniParser {
	private int currentToken;
	private List<String> input;

	public class ArmaniException extends Exception {
		private String cause;
		private int tokenId;

		public ArmaniException(String cause) {
			this.cause = cause;
			this.tokenId = currentToken;
		}

		public String cause() {
			return this.cause + (tokenId!=0? " near " + input.get(tokenId-1): "" );
		}

		public int getCurrent() {
			return this.tokenId;
		}
	}

	/**
	 * Builds an ArmaniParser
	 * 
	 * @param input
	 *            string list with tokens
	 */
	public ArmaniParser(List<String> input) {
		this.input = input;
	}

	/**
	 * Evaluates and parses an Armani expression (predictive top-down parsing)
	 * 
	 * @return true when parsing was successful
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	public boolean parseArmani() throws ArmaniException {
		if (input.isEmpty())
			throw new ArmaniException("Expected input"); // Lista vazia sempre é
															// erro

		if (getNextToken().compareTo("design") == 0
				|| getNextToken().compareTo("invariant") == 0
				|| getNextToken().compareTo("heuristic") == 0) {
			parseDesignRule();
			consumeToken("$");
		} else {
			throw new ArmaniException("Expected input");
		}
		return true;
	}

	/**
	 * Evaluates and parses an design rule
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseDesignRule() throws ArmaniException {
		if (getNextToken().compareTo("design") == 0) {
			currentToken++;
			// Realizar ações de Design
			// Não faz chamada recursiva, sen dá lombra
		}
		if (getNextToken().compareTo("invariant") == 0) {
			currentToken++;
			// O resutado da avaliação deve ser true
			parseDesignRuleExpression();
		} else if (getNextToken().compareTo("heuristic") == 0) {
			currentToken++;
			// O resultado da avaliação pode não ser true
			parseDesignRuleExpression();
		} else {
			throw new ArmaniException("Expected design, invariant or heuristic");
		}
	}

	/**
	 * Evaluates and parses an design rule expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseDesignRuleExpression() throws ArmaniException {
		if ((getNextToken().compareTo("forall") == 0)
				|| (getNextToken().compareTo("exists") == 0)) {
			parseQuantifiedExpression();
		} else if (getNextToken().compareTo("-") == 0
				|| getNextToken().compareTo("not") == 0
				|| getNextToken().compareTo("(") == 0 || parseConstant()
				|| getNextToken().compareTo("{") == 0) {
			parseBooleanExpression();
		} else {
			throw new ArmaniException("Expected expression");
		}
	}

	/**
	 * Evaluates and parses an quantified-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseQuantifiedExpression() throws ArmaniException {
		if ((getNextToken().compareTo("forall") == 0)
				|| getNextToken().compareTo("exists") == 0) {
			currentToken++;
			parseId();
			if (getNextToken().compareTo(":") == 0) {
				currentToken++;
				if (parseId() || parseType()) {
					// Ações correspondentes para o interpretador
				} else
					throw new ArmaniException("Expected Type");
			}
			consumeToken("in");
			parseSetExpression();
			consumeToken("|");
			parseDesignRuleExpression();
		} else {
			throw new ArmaniException("Expected expression");
		}
	}

	/**
	 * Evaluates and parses an boolean-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseBooleanExpression() throws ArmaniException {
		parseOrExpression();
		while (true) {
			try {
				consumeToken("and");
			} catch (ArmaniException a) {
				break; // Sai do laço
			}
			parseOrExpression();
		}

	}

	/**
	 * Evaluates and parses an or-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseOrExpression() throws ArmaniException {
		parseImpliesExpression();
		while (true) {
			try {
				consumeToken("or");
			} catch (ArmaniException a) {
				break; // Sai do laço
			}
			parseImpliesExpression();
		}
	}

	/**
	 * Evaluates and parses an imply-expression
	 * 
	 * @throws ArmaniException
	 */
	private void parseImpliesExpression() throws ArmaniException {
		parseEqualityExpression();
		while (true) {
			if (getNextToken().compareTo("or") == 0) {
				consumeToken("or");
				parseEqualityExpression();
			} else
				break;
		}
	}

	/**
	 * Evaluates and parses and equality-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseEqualityExpression() throws ArmaniException {
		parseRelationalExpression();
		while (true) {
			if (getNextToken().compareTo("==") == 0) {
				consumeToken("==");
				parseRelationalExpression();
			} else if (getNextToken().compareTo("!=") == 0) {
				consumeToken("!=");
				parseRelationalExpression();
			} else
				break;
		}
	}

	/**
	 * Evaluates and parses an relational-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseRelationalExpression() throws ArmaniException {
		parseAdditiveExpression();
		while (true) {
			if (getNextToken().compareTo("<") == 0) {
				consumeToken("<");
				parseAdditiveExpression();
			} else if (getNextToken().compareTo(">") == 0) {
				consumeToken(">");
				parseAdditiveExpression();
			} else if (getNextToken().compareTo(">=") == 0) {
				consumeToken(">=");
				parseAdditiveExpression();
			} else if (getNextToken().compareTo("<=") == 0) {
				consumeToken("<=");
				parseAdditiveExpression();
			} else
				break;
		}
	}

	/**
	 * Evaluates and parses an additive-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseAdditiveExpression() throws ArmaniException {
		parseMultiplicativeExpression();
		while (true) {
			if (getNextToken().compareTo("+") == 0) {
				consumeToken("+");
				parseMultiplicativeExpression();
			} else if (getNextToken().compareTo("-") == 0) {
				consumeToken("-");
				parseMultiplicativeExpression();
			} else
				break;
		}
	}

	/**
	 * Evaluates and parses an multiplicative-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseMultiplicativeExpression() throws ArmaniException {
		parseUnaryExpression();
		while (true) {
			if (getNextToken().compareTo("*") == 0) {
				consumeToken("*");
				parseUnaryExpression();
			} else if (getNextToken().compareTo("/") == 0) {
				consumeToken("/");
				parseUnaryExpression();
			} else if (getNextToken().compareTo("%") == 0) {
				consumeToken("%");
				parseUnaryExpression();
			} else
				break;
		}
	}

	/**
	 * Evaluates and parses an unary-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseUnaryExpression() throws ArmaniException {
		if (getNextToken().compareTo("not") == 0) {
			// ações do not
			consumeToken("not");
			parseUnaryExpression();
		} else if (getNextToken().compareTo("-") == 0) {
			// ações do menos unário
			consumeToken("-");
			parseUnaryExpression();
		} else {
			parsePrimitiveExpression();
		}
	}

	/**
	 * Evaluates and parses and primitive-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parsePrimitiveExpression() throws ArmaniException {
		if (getNextToken().compareTo("(") == 0) {
			// ações do not
			consumeToken("(");
			parseDesignRuleExpression();
			consumeToken(")");
		} else if (parseConstant()) {
			// Ações da constante (calcular?)
			currentToken++; // Consumir constante
		} else if (getNextToken().compareTo("{") == 0 || parseId()) {
			// SetExpression
			parseSetExpression();
		} else
			throw new ArmaniException("Expected primary-expression");
	}

	/**
	 * Evaluates and parses an set-expression
	 * 
	 * @throws ArmaniException
	 *             when an invalid token was found
	 */
	private void parseSetExpression() throws ArmaniException {
		if (getNextToken().compareTo("{") == 0) {
			consumeToken("{");
			if (getNextToken().compareTo("}") == 0) { // Conjunto vazio
				consumeToken("}");
				// TODO Ações do conjunto vazio
			} else {
				// Conjunto feito na mão

				// parse constant não retorna false, se der errado ele dispara
				// exceção
				parseConstant();
				currentToken++;

				// Consumir o ( "," ( LiteralConstant ) )* "}"
				while (true) {
					if (getNextToken().compareTo(",") == 0) {
						consumeToken(",");
						parseConstant();
						currentToken++;
					} else if (getNextToken().compareTo("}") == 0) {
						consumeToken("}");
						break;
					} else
						throw new ArmaniException("Invalid set expression");
				}
			}
		} else if (parseId()) {
			consumeToken(".");
			parseTypes();
		} else
			throw new ArmaniException("Invalid set expression");
	}

	/**
	 * Parses types
	 * @throws ArmaniException 
	 */
	private void parseTypes() throws ArmaniException {
		if (getNextToken().compareTo("Components")==0
				|| getNextToken().compareTo("Roles")==0
				|| getNextToken().compareTo("Ports")==0
				|| getNextToken().compareTo("Representations")==0
				|| getNextToken().compareTo("Properties")==0
				|| getNextToken().compareTo("Elements")==0
				|| getNextToken().compareTo("Connectors")==0
				) {
			// TODO action
		}
		else {
			throw new ArmaniException("Expected Components, Roles, Ports, Connectors, Representations, Properties or Elements");
		}
	}

	/**
	 * Evaluates and parses (if the evaluation was successful) an Type
	 * 
	 * @return true if evaluation and parsing were successful
	 * @throws ArmaniException 
	 */
	private boolean parseType() throws ArmaniException {
		if (getNextToken().compareTo("Component")==0
				|| getNextToken().compareTo("Role")==0
				|| getNextToken().compareTo("Port")==0
				|| getNextToken().compareTo("Representation")==0
				|| getNextToken().compareTo("Property")==0
				|| getNextToken().compareTo("Connector")==0
				) {
			// TODO action
			return true;
		}
		else {
			throw new ArmaniException("Expected Component, Role, Port, Connector, Representation or Property");			
		}
	}

	/**
	 * Evaluates and parses (if the evaluation was successful) an Identifier
	 * 
	 * @return true if an ID was successful evaluated and parsed
	 * @throws ArmaniException 
	 */
	private boolean parseId() throws ArmaniException {
		String id = getNextToken();
		if (id.matches("^?[a-z|A-Z|_][a-z|A-Z|_|0-9]*")) { // ID bem formado
			currentToken++;
			return true;
		} else
			return false;
	}

	/**
	 * Parses an constant
	 * 
	 * @return true if an constant was successful parsed
	 * @throws ArmaniException
	 *             when the current token ins't an constant
	 */
	private boolean parseConstant() throws ArmaniException {
		String constant = getNextToken();
		if (constant.matches("[0-9]+")) {
			// TODO int constant
		}
		else if (constant.matches("")) { // TODO String regex
			// TODO String constant 
		}
		return true;
	}

	/**
	 * Returns the next token
	 * 
	 * @return the next token of the string
	 * @throws ArmaniException
	 *             when there's no tokens left
	 */
	private String getNextToken() throws ArmaniException {
		if (currentToken < input.size()) {
			return this.input.get(currentToken);
		} else
			throw new ArmaniException("Invalid end of expression");
	}

	/**
	 * Consumes an single token
	 * 
	 * @param token
	 *            to be matched and consumed
	 * @throws ArmaniException
	 *             when token doesn't matches
	 */
	private void consumeToken(String token) throws ArmaniException {
		if (getNextToken().compareTo(token) == 0) {
			currentToken++;
			if (token.compareTo("$") == 0 && currentToken < input.size())
				throw new ArmaniException("Expected end of expression");
		} else
			throw new ArmaniException("Expected '" + token + "'");
	}
}