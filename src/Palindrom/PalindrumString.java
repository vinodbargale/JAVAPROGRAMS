 package Palindrom;

import java.util.Scanner;

public class PalindrumString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		String rev="";
		String org=str;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println(org+":String is palindrom");
		}
		else {
			System.out.println(org+":String is not palindrom");
		}
	}

}
