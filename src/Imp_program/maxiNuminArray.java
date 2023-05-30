package Imp_program;

public class maxiNuminArray {
	public static void main(String[] args) {
		int []a= {2,12,8,9,8,7,1};

	int max=a[0];
	
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		
	}
	
	System.out.println(max);
	
	int []aa= {4,3,5,7,8,5};
	
	int min=aa[0];
	for(int i=1;i<aa.length;i++) {
		if(aa[i]<min){
			min=aa[i];
		}
	}
		System.out.println(min);
		
		
		
		
		
		
	}

}
