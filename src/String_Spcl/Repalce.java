package String_Spcl;
//Remove with spaces
public class Repalce {
	public static void main(String[] args) {
		//repace all
		//Remove with spaces
		String name="I  love    my     country";
		String con=name.replaceAll("\\s", "");
		System.out.println(con);
		
		
		
		
		
		
	//replace 
	//repalce all amtching element	
	String con1=name.replace("my","our");
	System.out.println(con1);
	
	String name1="this is demo";
	// repalce first
	//repalce first matcing element
	String con2=name1.replaceFirst("is", "was");
	System.out.println(con2);
	
	
	String co=name1.replaceAll("is(.)", "was");
	System.out.println(co);
	String co1=name1.replaceAll("is(.*)", "was");
	System.out.println(co1);
	
	
		
	}
  
}
