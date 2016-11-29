package romanToArabic;

import java.util.HashMap;

public class Converter {
	public static void main(String[] args) {
		System.out.println(convertOnechar('V'));
		System.out.println(convertRomanToArabic("CMIX"));
		System.out.println(convertRomanToArabic("IC"));
		System.out.println(convertRomanToArabic("MCMXCIX"));
		System.out.println(convertRomanToArabic("DCCCLXXXVIII"));
		
		HashMap<Character, Character> map = new HashMap<>();
		map.put('A', 'B');
		map.put('C', 'D');
		map.put('L', 'D');
		for (Character key : map.keySet()) {
			System.out.println(key + "-" + map.get(key));
			
		}

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
	private static int convertRomanToArabic(String str){
		
		int sum=convertOnechar(str.charAt(str.length()-1));
		for (int i = 0; i < str.length()-1; i++) {
		
			if (convertOnechar(str.charAt(i)) < convertOnechar(str.charAt(i+1)) ){
				sum-=convertOnechar(str.charAt(i));
				
			}
			else {
				sum+=convertOnechar(str.charAt(i));
				
			}
		}
		return sum;
		
	}

}

