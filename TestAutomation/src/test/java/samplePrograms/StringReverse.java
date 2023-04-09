package samplePrograms;

import java.util.HashMap;

public class StringReverse {

	public static void main(String[] args) {

		String s="Java Programs Santosh";
		String reversedString="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			reversedString=reversedString+s.charAt(i);
		}
		System.out.println(reversedString);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Madhu", 1);
		map.put("Mahal", 2);
		map.put("Vedhant", 3);
		map.put("Suprith", 4);
		map.put("Santosh", 5);
		System.out.println(map);
	}

}
