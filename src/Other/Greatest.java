package Other;

import java.util.Scanner;

//if else

public class Greatest {
	public static void main(String[] args) {
		/*int a=100;
		int b=78;
		int c=19;
		if(a>=b&&a>=c) */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println(" Enter the value of B:");
		int b=sc.nextInt();
		System.out.println("enter the value of c:");
		int c=sc.nextInt();
		
		if(a>=b&&a>=c)		
		{
			
		
			System.out.println("The largest number is:"+a);
		}
		else if(b>=a&&b>=c) {
			System.out.println("the largest number is:"+b);
		}
		else {
			System.out.println("the gretest number is:"+c);
		}
		}

}
