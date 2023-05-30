package Odd_Even;

import java.util.Scanner;

public class Even_not {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbr");
	int num=sc.nextInt();
	
	
	if(num%2==0) {
		System.out.println("num is Even");
	}
	else {
		System.out.println("num is odd");
	}
	
}
}
