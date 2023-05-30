package String_Spcl;

import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) {
		// String string="The best of words";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter String");
		 String str=sc.nextLine();
		 
		int temp=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				temp++;
				
			}
		 }
		 System.out.println(temp);
		 
		 
		 
		 
		 
		 
	}

}
