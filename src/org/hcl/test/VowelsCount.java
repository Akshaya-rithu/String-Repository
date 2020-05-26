package org.hcl.test;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		int vcount = 0;
		int ccount = 0;
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		System.out.println(string);
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u')
				vcount++;
			else
				ccount++;
		}
		System.out.println(" Vowels count: " + vcount);
		System.out.println(" Consonants count: " + ccount);
		s.close();
	}

}
