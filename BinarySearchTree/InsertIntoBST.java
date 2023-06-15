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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode cur=root;
        while(true)
        {
            if(root.val<=val) 
            {
                if(root.right!=null) root=root.right;
                else
                {
                    TreeNode temp=new TreeNode(val);
                    root.right=temp;
                    break;
                }
            }
            else
            {
                  if(root.left!=null) root=root.left;
                else
                {
                    TreeNode temp=new TreeNode(val);
                    root.left=temp;
                    break;
                }
            }

        }
        return cur;
    }
}