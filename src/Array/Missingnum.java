package Array;

public class Missingnum {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,8};
	 int sum=0;
	 int n=arr.length;
	 
	 
	 int total_sum=(n+1)*(n+2)/2;
	 
	 for(int i=0;i<arr.length;i++) {
		 sum=sum+arr[i];
	 }
	 System.out.println(sum);
	 int missing=total_sum-sum;
	 System.out.println(missing);
}
}
