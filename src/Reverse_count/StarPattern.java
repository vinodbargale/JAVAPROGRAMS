package Reverse_count;
public class StarPattern{
	
	public static void main(String[] args) {
		
		String name="vi no d";
		
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ')
			{
				count++;
			}
		}
	System.out.println(count);
	System.out.println(name.length());	
	}
	
}