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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        Map<Integer,Integer>imap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            imap.put(inorder[i],i);
        }
        TreeNode root=buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,imap);
        return root;
    }
    public TreeNode buildTree(int inorder[],int is,int ie,int postorder[],int ps,int pe,Map<Integer,Integer> imap)
    {
        if(ps>pe|| is>ie ) return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int inRoot=imap.get(postorder[pe]);
        int numsleft=inRoot-is;
        root.left=buildTree(inorder,is,inRoot-1,postorder,ps,ps+numsleft-1,imap);
        root.right=buildTree(inorder,inRoot+1,ie,postorder,ps+numsleft,pe-1,imap);
        return root;
    }
}