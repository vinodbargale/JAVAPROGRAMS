package ArmStrong;



import java.util.Scanner;

public class Test1{

	public static void main(String[] args) {



		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("enter number"); int
		 * num=sc.nextInt(); int temp=num; int rem; int arm=0;
		 * 
		 * while(num>0) { rem=num%10;
		 * 
		 * arm=arm+(rem*rem*rem); num=num/10;
		 * 
		 * 
		 * }if(arm==temp) { System.out.println("the num is arm"); }
		 * 
		 * else { System.out.println("not"); }
		 * 
		 */

		System.out.println("===================range of armstrong==========================");


		int  no=400;
		int temp=no;


		for(int i=1;i<=no;i++) {
			temp=i;
			int	 arm=0;
			int	 rem=0;
			while(temp>0) {
				rem=temp%10;
				arm=arm+(rem*rem*rem);
				temp=temp/10;



			}
			if(arm==i) {
				System.out.println(i);
			}
		}



	
//i stopped explaining myself when i realized other people only understand from their level of perception 






	}}