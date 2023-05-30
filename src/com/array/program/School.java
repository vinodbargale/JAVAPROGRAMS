package com.array.program;

import java.util.HashMap;
import java.util.Map;

public class School {

	public static void main(String[] args) {
		String s="school";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i],hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i],1);
			}
		}
		for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
