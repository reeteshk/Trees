/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Tuple{
        int row;
        int col;
        TreeNode node;
        Tuple(TreeNode node,int row,int col)
        {
            this.node=node;
            this.row=row;
            this.col=col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        Queue<Tuple>q=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple tuple=q.remove();
            TreeNode node=tuple.node;
            int x=tuple.row;
            int y=tuple.col;
            if(!map.containsKey(x))
            {
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y))
            {
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).add(node.val); 
            if(node.left!=null)
            {
                q.add(new Tuple(node.left,x-1,y+1));
            }
            if(node.right!=null)
            {
                q.add(new Tuple(node.right,x+1,y+1));
            }

        }
        List<List<Integer>>list=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values())
        {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer>nodes:ys.values())
            {
                while(!nodes.isEmpty())
                {
                    System.out.println(nodes.peek());
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }
        return list;
    }
    
}