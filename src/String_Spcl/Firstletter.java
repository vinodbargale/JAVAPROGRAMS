package String_Spcl;

public class Firstletter {
	public static void main(String[] args) {
		
	
/*
    // create a string
    String name = "programiz";

    // create two substrings from name
    // first substring contains first letter of name
    // second substring contains remaining letters
    String firstLetter = name.substring(0, 1);
    String remainingLetters = name.substring(1,
    		name.length());

    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase();

    // join the two substrings
    name = firstLetter + remainingLetters;
    System.out.println("Name: " + name);
    String str = "hello world!";*/
		
String str="vinod";

String first_name=str.substring(0, 1);
String reaminng=str.substring(1, str.length());
String k=first_name.toUpperCase();
String a=k+ reaminng;
System.out.println(a);

 
String name="bargale";

String first=name.substring(0, 1);
String second=name.substring(1, name.length());
String fupper=first.toUpperCase();
String out=fupper+second;
System.out.println(out);

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Check if string is at least 2 characters long
        if(inputString.length() < 2) {
            System.out.println("String must be at least 2 characters long.");
            return;
        }
        
        // Convert second character to uppercase
        String outputString = inputString.substring(0, 1) 
                             + inputString.substring(1, 2).toUpperCase()
                             + inputString.substring(2);
        
        System.out.println("Modified string: " + outputString);
    }
}











/*String output=str.substring(1, 1).toUpperCase()+str.substring(1);
System.out.println(output);*/
 
 
 

}
}
