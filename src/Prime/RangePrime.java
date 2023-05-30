 package Prime;

import java.util.Scanner;

public class RangePrime {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		
		int num2=sc.nextInt();
	int i,j;
		for( i=num1;i<=num2;i++) {
    
		for(   j=2;j<=i;j++) {
			if(i%j==0) {
				break;
			}  
			
			
		}if(i==j) 
			System.out.println(j);
		
		}
	}
		
		
		
		
		
		}
		
	


