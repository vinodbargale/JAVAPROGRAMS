package Array_Interview;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {200,300,100,500,1000};
	
	for(int i=0;i<a.length-1;i++) {
		
		int temp=0;
		for(int j=0;j<a.length-1;j++) {
			
			if(a[j]<a[j+1]) {
				 temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
				
				
				
				
			}
		}
	}
	System.out.println("Arrays after sort:"+Arrays.toString(a));
}
}
