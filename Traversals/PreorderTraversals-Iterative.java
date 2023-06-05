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
    //static ArrayList<Integer>result;
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
      // result=new ArrayList<>();
       return preorder2(root);
      // return result;
        
    }
    public static ArrayList<Integer> preorder2(Node node)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        st.push(node);
        while(!st.isEmpty())
        {
            Node temp=st.pop();
            ans.add(temp.data);
            if(temp.right!=null)
            {
                st.push(temp.right);
            }
            if(temp.left!=null)
            {
                st.push(temp.left);
            }
        }
        return ans;
    }
}