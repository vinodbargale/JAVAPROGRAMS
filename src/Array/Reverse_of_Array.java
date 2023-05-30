package Array;

public class Reverse_of_Array {
	public static void main(String[] args) {
		int arr []= {10,20,30};
		System.out.println("length of array is"+arr.length);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
