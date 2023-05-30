package Odd_Even;

public class FetchOdd_Evencount {
public static void main(String[] args) {
	
	int num=1234567;
	
	int even_count=0;
	int odd_count=0;
	
	while(num>0) {
		
		int rem=num%10;//123456   12345 1234  123 12 1  //give last num
		if(rem%2==0)  //6%2==0
		{
			even_count++;// even
		}
		else {
			odd_count++;  //give odd
		}
		num=num/10;   //break the current num
	}
	System.out.println("the number of even count:"+even_count);
	System.out.println("the number of odd count:"+odd_count);
}
}
