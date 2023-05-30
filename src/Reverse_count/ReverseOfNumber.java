package Reverse_count;

public class ReverseOfNumber {
	public static void main(String[] args) {
		
	


		int nu=100002;
		int re=0;
		while(nu !=0) {
			int rem=nu%10;
			re=re*10+rem;
			nu=nu/10;
		}  
		System.out.println("The reverse of the given number is: " + re); 
		

	}}
