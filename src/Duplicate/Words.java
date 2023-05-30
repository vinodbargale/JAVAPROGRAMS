package Duplicate;

public class Words {
public static void main(String[] args) {
	String a[]= {"java","bava"};
	boolean flag=false;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]&&(i!=j)) {
				System.out.println(a[j]);
				
			}
			flag=true;
		}
		
	}if(flag==true) {
		System.out.println("not found");
	}
	
}
}
