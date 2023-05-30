package Imp_program;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {1,3,7,11,9,8};
	{
	for(int i=0;i<a.length;i++) {
	int	temp=0;
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]<a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		
				
			}}}System.out.println(a[1]);
				
			}
			}
		
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

