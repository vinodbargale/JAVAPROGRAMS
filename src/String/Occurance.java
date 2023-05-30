package String;

public class Occurance {
	public static void main(String[] args) {
		String s="VinodV";
		int count=s.length();
		int count_after=s.replace("V","").length();
		int  occurance=count-count_after;
		System.out.println(occurance);
	}
	

}
