package String_Spcl;

public class Remove_whiteSpace {
	public static void main(String[] args) {
		String str="A B C D";
		String str2=str.replaceAll("\\s","");
		System.out.println(str2);
	}

}
