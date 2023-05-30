package Rough;

public class Two {
static class Node{
	
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
	
static void printPreorder(Node node) {
	if(node==null) {
		return;
	}
	System.out.print(node.data+" ");
	printPreorder(node.left);
	printPreorder(node.right);
}
public static void main(String[] args) {
	Node root=new Node(45);
	root.left=new Node(25);
	root.right=new Node(75);
	root.left.left=new Node(15);
	root.left.right=new Node(35);
	System.out.println();
	printPreorder(root);
	
}
	
}
