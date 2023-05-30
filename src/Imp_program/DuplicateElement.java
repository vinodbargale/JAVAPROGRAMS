 package Imp_program;

import java.util.Arrays;

public class DuplicateElement {
public static void main(String[] args) {
	String[]a= {"Java","Python","Java"};
	
	//System.out.println(+a.length);
	
	for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]&&(i!=j))
			System.out.println(a[j]);
	}
	}
	
}
}
