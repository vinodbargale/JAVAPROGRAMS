package Duplicate;

public class Character {
public static void main(String[] args) {
	boolean flag=false;
	char[]a= {'a','b','c','d','d'};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]&&(i!=j)) {
				System.out.println(a[j]);
			}
		}}
}
}
