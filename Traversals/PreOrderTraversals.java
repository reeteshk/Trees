// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    static ArrayList<Integer>result;
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
       result=new ArrayList<>();
       preorder1(root);
       return result;
        
    }
    public static void preorder1(Node root)
    {
        if(root==null)
        {
            return;
        }
        result.add(root.data);
        preorder1(root.left);
        preorder1(root.right);
    }

}