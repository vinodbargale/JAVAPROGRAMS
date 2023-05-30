package Maxi_Minimum;

public class Second_Largest {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	
int	size=a.length;
	for(int i=0;i<size;i++) {
		
		for(int j=i+1;j<size;j++) {
			
			if(a[i]<a[j]) {
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
		}
		System.out.print(a[i]+" ");
		
	}
	System.out.print("\nsecond largest num is:"+a[size-2]);
}
}
