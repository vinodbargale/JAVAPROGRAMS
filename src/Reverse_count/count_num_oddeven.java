package Reverse_count;

public class count_num_oddeven {
	public static void main(String[] args) {
		
		
		int num=12345;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {  //1234  123  12 1
			
		int rem=num%10; //4   3  2
		
		if(num%2==0) {   //1  1
			even_count++;
		}
		else {
			odd_count++;  //1 1
		}
		num= num/10; //123  12 1
		
			
		}
		System.out.println(" number ofeven number:"+even_count);
		System.out.println( "number ofodd number:"+odd_count);
	}

}
