/* 
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
    // static ArrayList<Integer>result;
    ArrayList<Integer> inOrder(Node root) {
        // Code
    //      result=new ArrayList<>();
    //   inOrder1(root);
    //   return result;
        return inorderLevelWise(root);
    }
    public static ArrayList<Integer> inorderLevelWise(Node root)
    {
        Stack<Node>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        Node node=root;
        while(true)
        {
            if(node!=null)
            {
                st.push(node);
                node=node.left;
            }
            else
            {
                if(st.isEmpty())
                {
                    break;
                }
                node =st.pop();
                ans.add(node.data);
                node=node.right;
            }
           
        }
        return ans;
    }
}