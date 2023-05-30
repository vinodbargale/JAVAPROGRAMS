import java.util.Arrays;

public class Oxford
{
public static void main(String[] args) 
{
	int []a= {10,30,20,50,90,70};
	 
	
	for(int i=0;i<a.length-1;i++)
	{
		
		for(int j=0;j<a.length-1;j++) {
			
			
			if(a[j]<a[j+1]) {
				  
				
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(a));
	
}	
	
}
