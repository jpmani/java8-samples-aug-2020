package com.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Hi This is Mani How are you";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("reverse str:"+sb.reverse());
		char[] chAry = str.toCharArray();
		List<Character> charList = new ArrayList<>();
		for (char c : chAry) {
			charList.add(c);
		}
		Collections.reverse(charList);
		ListIterator<Character> lstIter = charList.listIterator();
		while(lstIter.hasNext()) {
			System.out.println("reverse:"+lstIter.next());
		}
	}

}
