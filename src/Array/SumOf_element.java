package Array;
// 

public class SumOf_element {
	public static void main(String[] args) {
	
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		
		  for(int i=0;i<a.length;i++) { 
			  sum=sum+a[i];
		  
		  }System.out.println(sum);
		 
		
		
		
		
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
