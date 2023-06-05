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
    static int maxi[];
    public int maxPathSum(TreeNode root) {
        
        maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
       maxPathSum(root,maxi);
       return maxi[0];
    }
    public static int maxPathSum(TreeNode root,int maxi[])
    {
        if(root==null) return 0;

        int leftSum=Math.max(0,maxPathSum(root.left,maxi));
        int rightSum=Math.max(0,maxPathSum(root.right,maxi));
        maxi[0]=Math.max(maxi[0],leftSum+rightSum+root.val);
        return root.val+Math.max(leftSum,rightSum);
    }
}