 package Imp_program;

public class DuplicateString {
public static void main(String[] args) {
	boolean flag=false;
	
	String []a= {"vinod","karan","java","go","java","go"};
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]&&(i!=j) ){
				System.out.println("Duplicate element is:"+a[i]);
			}
		}}
	
}
}