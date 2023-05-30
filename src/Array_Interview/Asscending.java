package Array_Interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Asscending {
	public static void main(String[] args) {
		int []a= {4,6,7,5,3};
		for(int i=0;i<a.length;i++) {
			
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		}System.out.println("Arrays after sort:"+Arrays.toString(a));	
}
}