package org.hcl.test;

import java.util.*;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String string1 = s.nextLine();
		System.out.println(string1);
		char[] array = string1.toCharArray();
		Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<string1.length();i++)
		{
			if(mp.containsKey(array[i]))
			{
				Integer n = mp.get(array[i]);
				mp.put(array[i], n+1);
			}
			else
				mp.put(array[i], 1);
		}
		System.out.println(mp);
		s.close();
	}
	

}
