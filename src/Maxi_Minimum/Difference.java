package Maxi_Minimum;

public class Difference {
public static void main(String[] args) {
	int []a= {1,2,4,5,6,7, 62};
	
	int max=a[0];
	int min=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i];
		//System.out.println(max);
	}
}
for(int i=0;i<a.length;i++) { 
	if(a[i]<min) {
		min=a[i];
		//System.out.println(min);
	}
}
System.out.println("The largest value is:"+max);
System.out.println("the smallest value is :"+min);

System.out.println("The difference is:"+(max-min));
}
}
