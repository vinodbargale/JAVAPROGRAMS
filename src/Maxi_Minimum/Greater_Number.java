



package Maxi_Minimum;

public class Greater_Number {
	public static void main(String[] args) {
		
		int []a= {10,5,7,25,22};
		int max=a[0];//10 //25
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
			max=a[i];	
			}
			}
			System.out.println(max);
	}

}
