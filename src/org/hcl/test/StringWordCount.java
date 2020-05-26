package org.hcl.test;

import java.util.*;

public class StringWordCount {

	public static void main(String[] args) {
		String s = "Mahendra singh dhoni dhoni singh sachin";
		//int length = s.length();
		
		String[] split = s.split(" ");
		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (mp.containsKey(split[i])) {
				Integer n = mp.get(split[i]);
				mp.put(split[i], n + 1);
			} else
				mp.put(split[i], 1);
		}
		System.out.println(mp);

	}

}
