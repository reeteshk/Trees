/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    static ArrayList<Integer>result;
    ArrayList<Integer> inOrder(Node root) {
        // Code
         result=new ArrayList<>();
       inOrder1(root);
       return result;
    }
    public static void inOrder1(Node root)
    {
        if(root==null)
        {
            return;
        }
         inOrder1(root.left);
        result.add(root.data);
        inOrder1(root.right);
    }
} 
