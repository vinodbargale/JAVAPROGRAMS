package Number;

import java.util.Scanner;

public class NumisPalindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int rem=0;
		int rev=0;
		int org=num;
		
		while(num !=0) {
			rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if(org==rev) {
			System.out.println("paindrom");
		}
		else
		System.out.println("not");
	}

}
