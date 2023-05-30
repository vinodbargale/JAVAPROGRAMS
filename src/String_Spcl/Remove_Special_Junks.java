package String_Spcl;

public class Remove_Special_Junks {
public static void main(String[] args) {
	String str="@$!@#123  ABCD()";
	
	String str2=str.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(str2);
}
}
