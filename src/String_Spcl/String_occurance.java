package String_Spcl;

public class String_occurance {

	public static void main(String[] args) {
		
		String str="Bargale";
		int before=str.length();
	int after=str.replace("a","").length();
	int count=before-after;
	System.out.println(count);
	
	
	
	
	String str1="Bargale";
	
String first=str1.substring(0, 1).toLowerCase()+str1.substring(1);
System.out.println(first);




String first1=str.substring(0,1)+str.substring(1, 2)+str.substring(2, 3)+str.substring(3, 4).toUpperCase()+str.substring(4);
System.out.println(first1);
	}
}
