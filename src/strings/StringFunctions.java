package strings;

public class StringFunctions {
	public static void main(String[] args) {
		String str1 = "My name is Subhakanta Roul";
		String str2 = "MY NAME IS SUBHAKANTA ROUL";
		String str3 = "my name is subhakanta roul";
		String str4 = "Mississippi";

		System.out.println(str1.charAt(4));
		System.out.println(str2.equalsIgnoreCase(str3));

		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf('a', 6));
		System.out.println(str4.indexOf("iss"));
		System.out.println(str4.indexOf("iss", 5));

		System.out.println(str4.length());
		String str5 = "";
		System.out.println(str5.length());

		System.out.println(str4.replace('s', 'z'));
		System.out.println(str4.replace("iss", "zy"));

		System.out.println(str1.substring(5));
		System.out.println(str2.substring(3, 9));

		System.out.println(str2.toLowerCase());
		System.out.println(str3.toUpperCase());

		int i = 5;
		StringFunctions stf = new StringFunctions();
		String str6 = String.valueOf(i);
		System.out.println(str6);
		String str7 = String.valueOf(stf);
		System.out.println(str7);
		System.out.println(String.valueOf(stf).getClass().getName());

		StringFunctions stfc = new StringFunctions();
		System.out.println(stfc);
		System.out.println(stfc.toString());

		System.out.println(str4.trim());

		System.out.println(str4.contains("ssp"));
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));

		System.out.println(str1.endsWith("a Roul"));
		byte b[] = str1.getBytes();
		for (int j = 0; j < b.length; j++) {
			System.out.print((char) b[j]);
		}

		System.out.println();
		char[] ch = new char[10];
		str1.getChars(0, 10, ch, 0);
		System.out.println(ch);

		System.out.println(str1.isEmpty());
		String str8 = "";
		String str9 = " ";
		System.out.println(str8.isEmpty());
//        the isBlank() is a java 11 method to check blank strings
//        returns true even is there are blank spaces. i.e it does not consider the blank spaces.
//		System.out.println(str8.isBlank());
		System.out.println(str9.isEmpty());
//		System.out.println(str9.isBlank());

		System.out.println(String.join(":", "26", "1", "2021"));
		System.out.println(String.join(":", "10", "51", "PM"));

		System.out.println(str1.startsWith("n", 3));
		System.out.println(str1.startsWith("My"));

		String str10[] = str1.split("a");
		for (String s : str10) {
			System.out.println(s);
		}

	}

	@Override
	public String toString() {
		return "hi you are hacked!!lol";
	}
}
