class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
         Map<Node,Node>parent=new HashMap<>();
        markParent(root,parent);
        Node targetnode=findNode(root,target);
        int cnt=-1;
        Queue<Node>q=new LinkedList<>();
        q.add(targetnode);
        Map<Node,Boolean> visited=new HashMap<>();
        visited.put(targetnode,true);
        while(!q.isEmpty())
        {
            cnt++;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                 Node temp=q.remove();
                if(temp.left!=null && visited.get(temp.left)==null)
                {
                    q.add(temp.left);
                    visited.put(temp.left,true);
                }
                if(temp.right!=null && visited.get(temp.right)==null)
                {
                    q.add(temp.right);
                    visited.put(temp.right,true);
                }
                if(parent.get(temp)!=null && visited.get(parent.get(temp))==null)
                {
                    q.add(parent.get(temp));
                    visited.put(parent.get(temp),true);
                }
                
            }
        }
        return cnt;
    }
    
    public static Node findNode(Node root,int target)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==target)
        {
            return root;
        }
        Node left1=findNode(root.left,target);
        if(left1!=null)
        {
            return left1;
        }
        Node right1 =findNode(root.right,target);
          if(right1!=null)
        {
            return right1;
        }
        return null;
    }
    
    public static void markParent(Node root,Map<Node,Node>parent)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            if(temp.left!=null)
            {
                parent.put(temp.left,temp);
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                parent.put(temp.right,temp);
                q.add(temp.right);
            }
        }
    }
}