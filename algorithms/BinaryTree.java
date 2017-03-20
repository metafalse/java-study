class Node {
  int key;
  Node left, right;
  
  public Node(int item) {
    key = item;
    left = right = null;
  }
}

class BinaryTree {
  Node root;
  
  public BinaryTree() {
    root = null;
  }
  
  void printPostorder(Node node) {
    if (node == null) return;
    
    printPostorder(node.left);
    printPostorder(node.right);
    System.out.print(node.key + " ");
  }
  
  void printInorder(Node node) {
    if (node == null) return;
    
    printInorder(node.left);
    System.out.print(node.key + " ");
    printPostorder(node.right);
  }
  
  void printPreorder(Node node) {
    if (node == null) return;
    
    System.out.print(node.key + " ");
    printInorder(node.left);
    printPostorder(node.right);
  }
}

public class Main {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    
    System.out.println("Preorder traversal of binary tree is ");
    tree.printPreorder(tree.root);
    
    System.out.println("\nInorder traversal of binary tree is ");
    tree.printInorder(tree.root);
    
    System.out.println("\nPostorder traversal of binary tree is ");
    tree.printPostorder(tree.root);
  }
}
