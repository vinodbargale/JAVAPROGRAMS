package Maxi_Minimum;

public class Min_Number {
public static void main(String[] args) {
	
	int a[]={1,2,3,15,4,5,6};
	
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
			
		}
	}
	System.out.println(min);
}
}
