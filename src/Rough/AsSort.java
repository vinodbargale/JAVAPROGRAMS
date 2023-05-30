package Rough;

import java.util.Arrays;

public class AsSort {
	public static void main(String[] args) {
		int[] a= {10,12,9,8,11};
		 for(int i=0;i<a.length;i++) {
			 int temp=0;
			 for(int j=i+1;j<a.length;j++) {
				 
				 if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				 }
				
			 }
			
		 } System.out.println("array after sort:"+Arrays.toString(a));
		 
	}

}
