package Fibonaci;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two scan number");
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int temp=0;
	System.out.println("program before swap:"+a+" "+b );
	
	temp=a;
	a=b;
	b=temp;
	System.out.println("prgram after swap:"+a+" "+b);
	}

}
