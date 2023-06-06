
/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    
    static class Tuple{
         Node node;
        int line;
        Tuple(Node node,int line)
        {
            this.node=node;
            this.line=line;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        TreeMap<Integer,Integer>hm=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.add(new Tuple(root,0));
        while(!q.isEmpty())
        {
            Node n=q.peek().node;
            int line=q.peek().line;
            q.remove();
            if(hm.containsKey(line)==false)
            {
                hm.put(line,n.data);
            }
            if(n.left!=null)
            {
                q.add(new Tuple(n.left,line-1));
            }
            if(n.right!=null)
            {
                q.add(new Tuple(n.right,line+1));
            }
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int k:hm.values())
        {
            al.add(k);
        }
        return al;
    }
}