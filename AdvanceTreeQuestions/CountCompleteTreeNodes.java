public class Solution {
    int cnt;
    public int countNodes(TreeNode root) {
       
       if(root==null) return 0;
       int left=getHeightLeft(root);
       int right=getHeightRight(root);
       if(left==right) return ((int)Math.pow(2,left+1)-1);
       else return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int getHeightLeft(TreeNode root)
    {
        int count=0;
        while(root.left!=null)
        {
            count++;
            root=root.left;
        }
        return count;
    }
    public int getHeightRight(TreeNode root)
    {
        int count=0;
        while(root.right!=null)
        {
            count++;
            root=root.right;
        }
        return count;
    }
    public void  usinginorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        cnt++;
        usinginorder(root.left);
        usinginorder(root.right);
    }
} 