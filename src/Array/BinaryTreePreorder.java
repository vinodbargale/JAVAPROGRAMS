package Array;

public class BinaryTreePreorder {
    
    // Define a Node class for the Binary Tree
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // Function to print the Preorder traversal of the Binary Tree
    static void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    
    // Main method to create the Binary Tree and call the Preorder function
    public static void main(String[] args) {
        Node root = new Node(45);
        root.left = new Node(25);
        root.right = new Node(75);
        root.left.left = new Node(15);
        root.left.right = new Node(35);
        
        System.out.println("Preorder Traversal of Binary Tree:");
        printPreorder(root);
    }
}



