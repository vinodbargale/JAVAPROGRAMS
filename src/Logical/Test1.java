package Logical;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		/*
		 * int num; for(int i=1;i<=5;i++) {
		 * 
		 * if(i%2==0) { num=0; System.out.print(num); } else { num=1;
		 * System.out.print(num); } for(int j=1;j<5;j++) {
		 * 
		 * if(num==1) { num=0;
		 * 
		 * } else { num=1; } System.out.print(num); }
		 * 
		 * System.out.println();
		 * 
		 * 
		 * 
		 * }
		 */
		for(int i=1;i<=5;i++) {
			
			int num= i%2==0 ?0:1;
			System.out.print(num);
			
			for(int j=1;j<5;j++) {
			 num=num==1?0:1;
			
			System.out.print(num);
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
