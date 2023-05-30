package Imp_program;

//The difernce between small and large value
public class Range {
	public static void main(String[] args) {
		int a[]= {1,2,5,6,7,8,5,9};
		int min=a[0];
		int max=a[0];
		
for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
			
			else if(a[i]<min) {
				
				
				min=a[i];
			}
		
		}
		
		int	distance=max-min;
		System.out.println("The largest value is:"+max);
		System.out.println("The Smallest value is:"+min);
		System.out.println("The difference is:"+distance);
		
	}
	
 
}
