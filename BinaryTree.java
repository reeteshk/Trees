class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
    }
}
public class BinaryTree{

    public static void main(String[] args) {
    
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println((root.data));
        System.out.println((root.left.data));
        System.out.println((root.right.data));
        System.out.println((root.left.left.data));
        System.out.println((root.left.right.data));
    

    }
}