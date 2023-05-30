 package Prime;

import java.util.Scanner;

public class primeornot {
	public static void main(String[] args)
	{
		

		
			Scanner sc=new  Scanner(System.in);
			System.out.println("enter number");
			int num=sc.nextInt();
			
			int temp=0;
	//boolean flag=false;		
			
for(int i=2;i<num-1;i++) {
	
	if(num%i==0) {
		temp++;
	//	flag=true;
		break;
		
	}
	
}
if(temp==0) {//(!falg)
		System.out.println("num is prime");
	}
	else {
		System.out.println("not prime");
	}
	

	}	}

/*
Scanner sc=new  Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int tem==0;
 for(int i=2;i<num;i++) {
	 if(num%i==0) {
		temp++;
	 }}
	 
	 if(temp>0) {
		 System.out.println("not prime");
	 }
	 else {
		 System.out.println(" prime");
	 }
 }*/


		
		
		
	
		
		
		
		
		
		/*	int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				temp++;
			}
		}
			if(temp==2) {
				System.out.println("num is parime");}
			else {
				System.out.println("num is not prime");
			}
			
		
		
	}*/

	
