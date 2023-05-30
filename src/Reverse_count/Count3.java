package Reverse_count;

import java.util.Scanner;

public class Count3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in)	;
	int count=0;
	System.out.println("enter a number::");
	int num=sc.nextInt();
	while(num>0) {
		num=num/10;
		count =count+1;
	}
	System.out.println("count of digit:"+count);
	}

}
