package String_Spcl;

import java.util.Scanner;

public class ReverseFirstString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter first name,secondname,lastname");
		
		String full_Name=sc.nextLine();
		
		//Split the String
		String [] full_nameArrays=full_Name.split(" ");
		//String [] full_nameAA=full.//.split("\\s"+"");
		
		//need to store a name in StringArray
		String first=full_nameArrays[0];
		String second=full_nameArrays[1];
		String third=full_nameArrays[2];
		
		//need to do expected String reverse
		String Second_reverse=new StringBuilder(third).reverse().toString();
		
		
		System.out.println("The first name is:"+first);
		System.out.println("The second name is:"+second);
		System.out.println("The third name is :"+Second_reverse);
		
		
	}

}
