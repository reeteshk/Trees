class Solution
{
    static class Pair{
        Node node;
        int line;
        Pair(Node node,int line)
        {
            this.node=node;
            this.line=line;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        Queue<Pair>q=new LinkedList<>();
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Node n=q.peek().node;
            int l=q.peek().line;
            q.remove();
            tm.put(l,n.data);
            if(n.left!=null)
            {
                q.add(new Pair(n.left,l-1));
            }
             if(n.right!=null)
            {
                q.add(new Pair(n.right,l+1));
            }
        }
        ArrayList<Integer>ans =new ArrayList<>();
        for(int k:tm.values())
        {
            ans.add(k);
        }
        return ans;
    }
}