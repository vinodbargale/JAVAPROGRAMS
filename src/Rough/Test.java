package Rough;

public class Test {
public static void main(String[] args) {
	int a[]= {3,1,4,5,6,7,12,9};
	int size=a.length;
	
	
	for(int i=0;i<size;i++) {
		
		
		int temp=0;
		for(int j=i+1;j<size;j++) {
			if(a[i]>a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}System.out.print(a[i]+" ");
	}
	int max=a[size-2];
	
	int min=a[0];
	
	for(int k=0;k<a.length;k++) {
		if(a[k]<min) {
			min=a[k];
		}
		
		
	}
	
	System.out.print("\n the greter distance is:"+(max-min));
	System.out.print("\n the diffrence is:"+(+min+","+max));
}
}
