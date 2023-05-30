package Duplicate;

public class Number {
public static void main(String[] args) {
	int[] a= {11,12,11,12,1,13,1,14};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]&&(i!=j)) {
				System.out.println(a[j]);
			}
	}
}
}}
