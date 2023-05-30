package String_Spcl;

public class Reverse_Each_word {
public static void main(String[] args) { 
	String inputstring="go to school";
	
	String words[]=inputstring.split(" ");//go,to,school 
	String reversestring="";
	
	for(int i=0;i<words.length;i++) {
	String	word= words[i];
	String	reverseword="";
		
	
	for(int j=word.length()-1;j>=0;j--) {
		reverseword=reverseword+word.charAt(j);
		
		
	}
	reversestring=reversestring+reverseword+"   ";
		
	}
	System.out.println(	reversestring);
	
}
}
