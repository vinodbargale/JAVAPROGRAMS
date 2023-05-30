package Palindrom;

import java.util.Scanner;

public class Plindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
	int num=sc.nextInt();
		int rev = 0;
		int rem=0;
		int org=num;
		while(num!=0) {
			rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if(org==rev) {
			System.out.println(org+":is palindrom");
		}
		else {
			System.out.println(org+":is not palindrom");
		}


		
		
	}

}
