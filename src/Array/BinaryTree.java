package Array;

import java.security.DomainCombiner;

public class BinaryTree {

 static class Node
 {
int data;
Node right,left;

Node(int data){
	this.data=data;
	this.right=null;
			this.left=null;
	
} static void printPreorder(Node node) {
	if(node==null) {
		return;
	}
	System.out.print(node.data+" ");
	printPreorder(node.right);
	printPreorder(node.left);
}
public static void main(String[] args) {
	Node root=new Node(45);
	root.left=new Node(25);
	root.right=new Node(15);
	root.left.left=new Node(35);
	root.left.right=new Node(75);
	System.out.println();
	printPreorder(root);
}
 }
 }
	
	
	


