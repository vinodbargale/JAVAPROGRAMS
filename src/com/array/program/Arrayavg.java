package com.array.program;

import java.util.Scanner;

public class Arrayavg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
System.out.println("Enter how many element you want?");

int n=sc.nextInt();

double []arr=new double[n];

System.out.println("enter"+n+"the numbers");
double sum =0;
for(int i=0;i<arr.length;i++) {
	
	arr[i]=sc.nextDouble();
	//sum+=arr[i];
	
	sum=sum+arr[i];
	}
System.out.println("average is:"+sum/n);
}
}