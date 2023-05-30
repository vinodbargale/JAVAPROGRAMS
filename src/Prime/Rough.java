package Prime;
import java.util.Scanner;

public class Rough {
	public static void main(String[] args) {

		/*
		 * for(int i=2;i<=50;i++) {
		 * 
		 * 
		 * int temp=0; for(int j=2;j<i-1;j++) {
		 * 
		 * if(i%j==0) { temp++;
		 * 
		 * } } if(temp==0) { System.out.println(i); }
		 * 
		 * else { temp=0; } }
		 */


		/*
		 * for(int i=2;i<=100;i++) {
		 * 
		 * boolean isPrime=true;
		 * 
		 * for(int j=2;j<=i;j++) { if(i%j==0) { isPrime=false; }
		 * 
		 * 
		 * 
		 * } if(isPrime) { System.out.print(i+" ,"); } else { isPrime=false; }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int i,j;
		int temp=0;
		for( i=num1;i<=num2;i++) {
			
			for( j=2;j<=i;j++) {
				
				if(i%j==0) {
				break;
				}
			}
			if(i==j) {
				System.out.println(j);
			}
		}
		
		
	}}

