package Array;

public class ThreeD_Array {
	
	public static void main(String[] args) {
		int a[][][]= {{{10,20,30},{40,50,60},{70,80,90}},{{1,2,3},{4,5,6},{7,8,9}}};
		
		System.out.println("the number of two dimensional array in 3 dimensional array iss "+a.length);
		
		System.out.println("the number of 1 dimensional array in first 2 dimenisal array:"+a[0].length);
		System.out.println("the number of 1 dimensional array in second 2 dimenisal array:"+a[1].length);
		
		System.out.println("the number of value in first single dimension array:"+a[0][0].length);
		System.out.println("the number of value in first single dimension array:"+a[1][0].length);
		
	for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[0].length;j++) {
				
				for(int k=0;k<a[0][0].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
	}
			}
		
	

}
