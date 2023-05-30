package String_Spcl;

import java.util.Scanner;

public class AsciValue {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the cahracter:");
		 
		 char ch=sc.nextLine().charAt(0);
		 
		 int av=(int) ch;
		 System.out.println(av);
	}

}
