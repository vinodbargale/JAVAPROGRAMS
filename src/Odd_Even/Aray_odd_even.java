package Odd_Even;

public class Aray_odd_even {
public static void main(String[] args) {
int arr[]= {2,3,4,5,6,7};
System.out.println("Even number in array");
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]+" ");
	}
}
System.out.println("the odd number is");
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2!=0) {
		System.out.println(arr[i]);
	}
}

}
}
