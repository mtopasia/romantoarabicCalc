package romanToArabic;

import java.util.HashMap;

public class Converter {
	public static void main(String[] args) throws Exception {
		System.out.println(convertOnechar('V'));
		System.out.println(convertRomanToArabic("CMIX"));
		System.out.println(convertRomanToArabic("IM"));
		System.out.println(convertRomanToArabic("MCMXCIX"));
		System.out.println(convertRomanToArabic("DCCCLXXXVIII"));

		HashMap<Character, Character> map = new HashMap<>();
		map.put('X', 'I');
		map.put('C', 'X');
		map.put('M', 'C');
		map.put('V', 'I');
		map.put('L', 'X');
		map.put('D', 'C');
		// System.out.println(map.get('M').equals('C'));
		// for (Character key : map.keySet()) {
		// System.out.println(key + "-" + map.get(key));
		// }
		System.out.println();
		System.out.println(isNumValid('X', 'L'));

	}

	private static int convertOnechar(char c) {
		switch (c) {
		case 'I':

			return 1;
		case 'V':

			return 5;
		case 'X':

			return 10;
		case 'L':

			return 50;
		case 'C':

			return 100;
		case 'D':

			return 500;
		case 'M':

			return 1000;

		default:
			System.out.println("Pole Rooma number");
			return 0;
		}

	}

	private static int convertRomanToArabic(String str) throws Exception {
		int sum = convertOnechar(str.charAt(str.length() - 1));
		for (int i = 0; i < str.length() - 1; i++) {
			if (convertOnechar(str.charAt(i)) < convertOnechar(str.charAt(i + 1))) {
				if (isNumValid(str.charAt(i), str.charAt(i + 1))) {
					sum -= convertOnechar(str.charAt(i));
				} else {
					throw new Exception("vigane rooma nr");
				}

			} else {
				sum += convertOnechar(str.charAt(i));

			}

		}
		return sum;
	}

	// System.out.println(convertRomanToArabic("CMIX"));
	// System.out.println(convertRomanToArabic("IC"));
	// System.out.println(convertRomanToArabic("MCMXCIX"));
	private static boolean isNumValid(char num1, char num2) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('X', 'I');
		map.put('C', 'X');
		map.put('M', 'C');
		map.put('V', 'I');
		map.put('L', 'X');
		map.put('D', 'C');

		// for (Character key : map.keySet()) {
		// System.out.println(key + "-" + map.get(key));
		// }
		return map.get(num2).equals(num1);

	}

}
