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
    static ArrayList<Integer>al;
   public int kthSmallest(TreeNode root, int k) {

           al=new ArrayList<Integer>();

           inorderTraversal(root);
           
           return al.get(k-1);
   }
   public static void inorderTraversal(TreeNode root)
   {
       if(root==null)
       {
           return;
       }
       inorderTraversal(root.left);
       al.add(root.val);
       inorderTraversal(root.right);
   }
}