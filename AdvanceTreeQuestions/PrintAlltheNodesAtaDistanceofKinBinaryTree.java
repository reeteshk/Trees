/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode,TreeNode>parent=new HashMap<>();
        markParent(root,parent);
        Map<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        int curr_level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(curr_level==k) break;
            curr_level++;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.remove();
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
        List<Integer> al=new ArrayList<>();
        while(!q.isEmpty())
        {
            al.add(q.remove().val);
        }
        return al;
    }
    public static void markParent(TreeNode root,Map<TreeNode,TreeNode>parent)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp=q.remove();
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