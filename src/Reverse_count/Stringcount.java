 package Reverse_count;

import java.util.Scanner;

public class Stringcount {
	public static void main(String[] args) {
		
	String str="java is language";
	
	int temp=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			temp++;
		}
		
	}
	System.out.println(temp);
	
	
	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	
	String s=sc.nextLine();
	int count=1;
	for(int i=0;i<s.length()-1;i++) {
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
			count++;
		}
	}
	System.out.println(count);

}}
