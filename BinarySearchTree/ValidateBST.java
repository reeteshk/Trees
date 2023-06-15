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
    boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        
        Long min=Long.MIN_VALUE;
        Long max=Long.MAX_VALUE;
        // return helper(root,min,max);
        helper2(root,min,max);
        return flag;
    }
    public boolean helper(TreeNode root,Long min,Long max)
    {
        if(root==null)
        {
            return true;
        }
        if(root!=null && root.val<=min) return false;
        if(root!=null && root.val>=max) return false;

        return helper(root.left,min,(long)root.val) && helper(root.right,(long)root.val,max);

    }

    public void helper2(TreeNode root,Long min,Long max)
    {
        if(root==null)
        {
            return;
        }
        if(root!=null && root.val<=min) {
            flag=false;
        }
        if(root!=null && root.val>=max) 
        {
        flag=false;
        }

         helper2(root.left,min,(long)root.val);
         helper2(root.right,(long)root.val,max);

    }
}