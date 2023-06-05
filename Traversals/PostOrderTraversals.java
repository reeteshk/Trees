/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree
    static ArrayList<Integer>result;
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        result=new ArrayList<>();
       postOrder1(root);
       return result;
    }
     public static void postOrder1(Node root)
    {
        if(root==null)
        {
            return;
        }
         postOrder1(root.left);
        postOrder1(root.right);
         result.add(root.data);
    }
}
