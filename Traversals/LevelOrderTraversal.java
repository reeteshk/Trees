/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        ArrayList<Integer>ans=new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            ans.add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        return ans;
    }
}

/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/


class Level_Order_Traverse
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            ArrayList<Integer>al=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node temp=q.remove();
                al.add(temp.data);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            ans.add(al);
        }
        return ans;
    }
}