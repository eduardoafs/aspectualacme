package aspectualacme.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegex {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".*Album.*");
		Matcher m = p.matcher("AlbumData");
		System.out.println(m.matches());
	}
}
