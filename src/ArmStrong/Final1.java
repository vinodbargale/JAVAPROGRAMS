package ArmStrong;

import java.util.Scanner;

public class Final1 {
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		
		int temp=num;
		int rem;
		int arm=0;
		while(num>0) {
			rem=num%10;//153 3  15  5   1
			num=num/10;// 15    5
			arm=arm+(rem*rem*rem);//27 125 
		
		}if(arm==temp) {
			System.out.println("num is arm");
		}
		else {
			System.out.println("num is not arm");
		}
		

	}}
