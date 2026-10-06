class Node{
    int data;
   // Node root; didn't need it because it's not the property of all trees
    Node left;
    Node right;


  Node(int value){
  this.data=value;
  this.left=null;
  this.right=null;
}
}

public class Tree_ll {
    static int display(Node root){
        if(root==null){
            return 0;
        }
        display(root.left);
        System.out.print(root.data+"");
        display(root.right);
        return 1;
    }
public static void main(String args[]){
   Node root=new Node(10);   //for my entire tree I need this node
    root.left=new Node(8);
    root.right=new Node(21);
    root.left.left=new Node(6);
    root.right.right=new Node(22);
    System.out.println("Inorder Traversal:"+" ");
    display(root);
}
}













