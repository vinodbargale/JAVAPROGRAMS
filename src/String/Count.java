package String;

import java.util.Scanner;

public class Count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
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
