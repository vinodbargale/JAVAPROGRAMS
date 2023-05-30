package Imp_program;

public class Duplicate {
	public static void main(String[] args) {
		int a[]= {1,4,3,5,5,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&(i!=j)) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
