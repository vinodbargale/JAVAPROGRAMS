package Rough;

public class One {
	public static void main(String[] args) {
		
 int []a= {1,2,3,4,6,8,7,9,};
 
 int sum=0;
 int n=a.length;
 
int total_sum=(n+1)*(n+2)/2;

for(int i=0;i<=n;i++) {
	sum=sum+i;
}
int missing=total_sum-sum;
System.out.println(missing);
 

	}


}
