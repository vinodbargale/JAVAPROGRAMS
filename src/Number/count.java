package Number;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	long num=sc.nextLong();
	long temp=0;
	while(num !=0) {
		num=num/10;
		temp++;
	}
	System.out.println(temp);
}
}
