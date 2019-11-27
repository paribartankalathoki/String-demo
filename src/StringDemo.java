/**
 * @author Paribartan
 *
 */

public class StringDemo {

	public static void main(String[] args) {
		String name = "  Rajesh Dai  ";
		String n2 = "Rajesh dai";
		String n3 = "";
		String n4 = "PariBARtan";

//		to check the length of  string
		int l = name.length();
		System.out.println("Length of name: " + l);
		System.out.println("character: " + name.charAt(5));

//		to avoid first/last unnecessary space
		String n1 = name.trim();
		System.out.println("name: " + n1);
		System.out.println("length of n1: " + n1.length());

//		to check equal methods
		System.out.println(n2.equals(n1));

//		equalIgnore case that means only ignore lowercase and uppercase
		System.out.println(n2.equalsIgnoreCase(n1));

//		concate two string
		System.out.println(name.concat(n2));

//		indexof methods
		System.out.println(n2.indexOf('R'));

//		to check isEmpty or not
		System.out.println("isEmpty: " + n2.isEmpty());
		System.out.println("isEmpty: " + n3.isEmpty());

//		replace string
		System.out.println("Previous  sting:" + n3);
		System.out.println("Replaced string: " + n3.replace("", "paribartan kalathoki"));

//		tolowerCase/ touppercase
		System.out.println("Lowercase string: " + n4.toLowerCase());
		System.out.println("Uppercase string: " + n4.toUpperCase());

//		contains methods
		System.out.println("Contain method output: " + name.contains(n4));

//		split methods java
		String[] nam = name.split(" ");
		for (int i = 0; i < nam.length; i++) {
			System.out.println("From split method: " + nam[i]);
		}

//		substring method
		System.out.println("Substring output: " + n2.substring(3, 5));
		String a = "asdfgjk";
		System.out.println("Substring output: " + a.substring(3, 5));

//		value of methods
		System.out.println("value of: " + String.valueOf(n2));
		
		String x= "10";
		String y="2";
		System.out.println("number" + x.concat(y));
	}

}