package Array;

public class Copy {
public static void main(String[] args) {
	int org[]= {10,20,30};
	
	int copy []=org;
	
	  org[2]=300;
	  System.out.println("The original array is");
	  for(int i=0;i<org.length;i++) {
		  System.out.print(org[i]+" ");
	  }
	System.out.println("\nthe copied array");
	for(int j=0;j<copy.length;j++) {
		System.out.print(copy[j]+" ");
	}
	
}
}
