package String_Spcl;

public class DuplicateChracter {
public static void main(String[] args) {
	
	String str="Automation";
	
	char[]ch=str.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++) {
		
		for(int j=i+1;j<ch.length;j++) {
			
			if(ch[i]==ch[j]) {
				System.out.println(ch[j]);
				count++;
			}
		}
	
		
	}
	System.out.println(count);
	
}}
	
	
	/*int count=0;
	char[] ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]&&ch[i]!=' ') {
				count++;
				ch[j]='0';
			//	System.out.println(ch[j]);
			}
			
		}
		if(count>1 && ch[i]!='0') {
			System.out.println(ch[i]);
		}
		
	}
	System.out.println(count);*/
