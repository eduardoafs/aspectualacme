/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.util;

import aspectualacme.Armani;
import aspectualacme.ArmaniAdditiveExpression;
import aspectualacme.ArmaniBooleanExpression;
import aspectualacme.ArmaniConstant;
import aspectualacme.ArmaniDesignRuleExpression;
import aspectualacme.ArmaniEqualityExpression;
import aspectualacme.ArmaniExpression;
import aspectualacme.ArmaniFunctionCall;
import aspectualacme.ArmaniIffExpression;
import aspectualacme.ArmaniImpliesExpression;
import aspectualacme.ArmaniMultiplicativeExpression;
import aspectualacme.ArmaniOrExpression;
import aspectualacme.ArmaniPrimitiveExpression;
import aspectualacme.ArmaniQuantifiedExpression;
import aspectualacme.ArmaniRelationalExpression;
import aspectualacme.ArmaniSetExpression;
import aspectualacme.ArmaniUnaryExpression;
import aspectualacme.ArmaniVariable;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BaseRole;
import aspectualacme.BasicElement;
import aspectualacme.BindableElement;
import aspectualacme.Binding;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Element;
import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Glue;
import aspectualacme.Import;
import aspectualacme.Port;
import aspectualacme.PortType;
import aspectualacme.Product;
import aspectualacme.ProductLine;
import aspectualacme.Property;
import aspectualacme.PropertyType;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.RoleType;
import aspectualacme.Root;
import aspectualacme.TypeDefinition;
import aspectualacme.WildCard;
import aspectualacme.attachableElement;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see aspectualacme.AspectualacmePackage
 * @generated
 */
public class AspectualacmeSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AspectualacmePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualacmeSwitch() {
		if (modelPackage == null) {
			modelPackage = AspectualacmePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AspectualacmePackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ATTACHABLE_ELEMENT: {
				attachableElement attachableElement = (attachableElement)theEObject;
				T result = caseattachableElement(attachableElement);
				if (result == null) result = caseElement(attachableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.BASIC_ELEMENT: {
				BasicElement basicElement = (BasicElement)theEObject;
				T result = caseBasicElement(basicElement);
				if (result == null) result = caseElement(basicElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.FAMILY: {
				Family family = (Family)theEObject;
				T result = caseFamily(family);
				if (result == null) result = caseBasicElement(family);
				if (result == null) result = caseElement(family);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = caseTypeDefinition(componentType);
				if (result == null) result = caseElement(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = caseTypeDefinition(roleType);
				if (result == null) result = caseElement(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				T result = casePortType(portType);
				if (result == null) result = caseTypeDefinition(portType);
				if (result == null) result = caseElement(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.CONNECTOR_TYPE: {
				ConnectorType connectorType = (ConnectorType)theEObject;
				T result = caseConnectorType(connectorType);
				if (result == null) result = caseTypeDefinition(connectorType);
				if (result == null) result = caseElement(connectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = caseTypeDefinition(propertyType);
				if (result == null) result = caseElement(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.SYSTEM: {
				aspectualacme.System system = (aspectualacme.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseBasicElement(system);
				if (result == null) result = caseElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseattachableElement(role);
				if (result == null) result = caseBindableElement(role);
				if (result == null) result = caseElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.BASE_ROLE: {
				BaseRole baseRole = (BaseRole)theEObject;
				T result = caseBaseRole(baseRole);
				if (result == null) result = caseRole(baseRole);
				if (result == null) result = caseattachableElement(baseRole);
				if (result == null) result = caseBindableElement(baseRole);
				if (result == null) result = caseElement(baseRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.CROSSCUTTING_ROLE: {
				CrosscuttingRole crosscuttingRole = (CrosscuttingRole)theEObject;
				T result = caseCrosscuttingRole(crosscuttingRole);
				if (result == null) result = caseRole(crosscuttingRole);
				if (result == null) result = caseattachableElement(crosscuttingRole);
				if (result == null) result = caseBindableElement(crosscuttingRole);
				if (result == null) result = caseElement(crosscuttingRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseattachableElement(port);
				if (result == null) result = caseBindableElement(port);
				if (result == null) result = caseElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.GLUE: {
				Glue glue = (Glue)theEObject;
				T result = caseGlue(glue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.WILD_CARD: {
				WildCard wildCard = (WildCard)theEObject;
				T result = caseWildCard(wildCard);
				if (result == null) result = caseattachableElement(wildCard);
				if (result == null) result = caseElement(wildCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.BINDABLE_ELEMENT: {
				BindableElement bindableElement = (BindableElement)theEObject;
				T result = caseBindableElement(bindableElement);
				if (result == null) result = caseElement(bindableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseElement(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI: {
				Armani armani = (Armani)theEObject;
				T result = caseArmani(armani);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_EXPRESSION: {
				ArmaniExpression armaniExpression = (ArmaniExpression)theEObject;
				T result = caseArmaniExpression(armaniExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_FUNCTION_CALL: {
				ArmaniFunctionCall armaniFunctionCall = (ArmaniFunctionCall)theEObject;
				T result = caseArmaniFunctionCall(armaniFunctionCall);
				if (result == null) result = caseArmaniPrimitiveExpression(armaniFunctionCall);
				if (result == null) result = caseArmaniUnaryExpression(armaniFunctionCall);
				if (result == null) result = caseArmaniExpression(armaniFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_SET_EXPRESSION: {
				ArmaniSetExpression armaniSetExpression = (ArmaniSetExpression)theEObject;
				T result = caseArmaniSetExpression(armaniSetExpression);
				if (result == null) result = caseArmaniPrimitiveExpression(armaniSetExpression);
				if (result == null) result = caseArmaniUnaryExpression(armaniSetExpression);
				if (result == null) result = caseArmaniExpression(armaniSetExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_CONSTANT: {
				ArmaniConstant armaniConstant = (ArmaniConstant)theEObject;
				T result = caseArmaniConstant(armaniConstant);
				if (result == null) result = caseArmaniPrimitiveExpression(armaniConstant);
				if (result == null) result = caseArmaniUnaryExpression(armaniConstant);
				if (result == null) result = caseArmaniExpression(armaniConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_PRIMITIVE_EXPRESSION: {
				ArmaniPrimitiveExpression armaniPrimitiveExpression = (ArmaniPrimitiveExpression)theEObject;
				T result = caseArmaniPrimitiveExpression(armaniPrimitiveExpression);
				if (result == null) result = caseArmaniUnaryExpression(armaniPrimitiveExpression);
				if (result == null) result = caseArmaniExpression(armaniPrimitiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_UNARY_EXPRESSION: {
				ArmaniUnaryExpression armaniUnaryExpression = (ArmaniUnaryExpression)theEObject;
				T result = caseArmaniUnaryExpression(armaniUnaryExpression);
				if (result == null) result = caseArmaniExpression(armaniUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_MULTIPLICATIVE_EXPRESSION: {
				ArmaniMultiplicativeExpression armaniMultiplicativeExpression = (ArmaniMultiplicativeExpression)theEObject;
				T result = caseArmaniMultiplicativeExpression(armaniMultiplicativeExpression);
				if (result == null) result = caseArmaniExpression(armaniMultiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_ADDITIVE_EXPRESSION: {
				ArmaniAdditiveExpression armaniAdditiveExpression = (ArmaniAdditiveExpression)theEObject;
				T result = caseArmaniAdditiveExpression(armaniAdditiveExpression);
				if (result == null) result = caseArmaniExpression(armaniAdditiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION: {
				ArmaniRelationalExpression armaniRelationalExpression = (ArmaniRelationalExpression)theEObject;
				T result = caseArmaniRelationalExpression(armaniRelationalExpression);
				if (result == null) result = caseArmaniExpression(armaniRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_EQUALITY_EXPRESSION: {
				ArmaniEqualityExpression armaniEqualityExpression = (ArmaniEqualityExpression)theEObject;
				T result = caseArmaniEqualityExpression(armaniEqualityExpression);
				if (result == null) result = caseArmaniExpression(armaniEqualityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_IFF_EXPRESSION: {
				ArmaniIffExpression armaniIffExpression = (ArmaniIffExpression)theEObject;
				T result = caseArmaniIffExpression(armaniIffExpression);
				if (result == null) result = caseArmaniExpression(armaniIffExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_IMPLIES_EXPRESSION: {
				ArmaniImpliesExpression armaniImpliesExpression = (ArmaniImpliesExpression)theEObject;
				T result = caseArmaniImpliesExpression(armaniImpliesExpression);
				if (result == null) result = caseArmaniExpression(armaniImpliesExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_OR_EXPRESSION: {
				ArmaniOrExpression armaniOrExpression = (ArmaniOrExpression)theEObject;
				T result = caseArmaniOrExpression(armaniOrExpression);
				if (result == null) result = caseArmaniExpression(armaniOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_VARIABLE: {
				ArmaniVariable armaniVariable = (ArmaniVariable)theEObject;
				T result = caseArmaniVariable(armaniVariable);
				if (result == null) result = caseArmaniExpression(armaniVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_BOOLEAN_EXPRESSION: {
				ArmaniBooleanExpression armaniBooleanExpression = (ArmaniBooleanExpression)theEObject;
				T result = caseArmaniBooleanExpression(armaniBooleanExpression);
				if (result == null) result = caseArmaniDesignRuleExpression(armaniBooleanExpression);
				if (result == null) result = caseArmaniExpression(armaniBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION: {
				ArmaniQuantifiedExpression armaniQuantifiedExpression = (ArmaniQuantifiedExpression)theEObject;
				T result = caseArmaniQuantifiedExpression(armaniQuantifiedExpression);
				if (result == null) result = caseArmaniDesignRuleExpression(armaniQuantifiedExpression);
				if (result == null) result = caseArmaniExpression(armaniQuantifiedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectualacmePackage.ARMANI_DESIGN_RULE_EXPRESSION: {
				ArmaniDesignRuleExpression armaniDesignRuleExpression = (ArmaniDesignRuleExpression)theEObject;
				T result = caseArmaniDesignRuleExpression(armaniDesignRuleExpression);
				if (result == null) result = caseArmaniExpression(armaniDesignRuleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniExpression(ArmaniExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniFunctionCall(ArmaniFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Set Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniSetExpression(ArmaniSetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniConstant(ArmaniConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Primitive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Primitive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniPrimitiveExpression(ArmaniPrimitiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniUnaryExpression(ArmaniUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniMultiplicativeExpression(ArmaniMultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniAdditiveExpression(ArmaniAdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniRelationalExpression(ArmaniRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniEqualityExpression(ArmaniEqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Iff Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Iff Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniIffExpression(ArmaniIffExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Implies Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Implies Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniImpliesExpression(ArmaniImpliesExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniOrExpression(ArmaniOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniVariable(ArmaniVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniBooleanExpression(ArmaniBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Quantified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Quantified Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniQuantifiedExpression(ArmaniQuantifiedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani Design Rule Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani Design Rule Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmaniDesignRuleExpression(ArmaniDesignRuleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachableElement(attachableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicElement(BasicElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamily(Family object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorType(ConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(aspectualacme.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseRole(BaseRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crosscutting Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crosscutting Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrosscuttingRole(CrosscuttingRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentation(Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildCard(WildCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armani</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armani</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmani(Armani object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindableElement(BindableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //AspectualacmeSwitch
