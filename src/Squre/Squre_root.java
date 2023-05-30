package Squre;

import java.util.Scanner;

public class Squre_root {
public static void main(String[] args) {
/*Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");

int num=sc.nextInt();

double squre=Math.sqrt(num);
System.out.println(squre);*/
	
	int num=9;
	double temp;
	double sr=num/2;
	
	do {
		temp=sr;
		sr=((temp+(num/temp))/2);
		//4.5  + 2=
	}
	while((temp-sr)!=0);
	System.out.println(sr);
	



}}