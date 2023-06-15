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
class BSTIterator {
    Stack<TreeNode>st;


    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        dfs(root);
    }
    public void dfs(TreeNode root)
    {
        while(root!=null)
        {
            st.push(root);
            root=root.left;
        }

    }
    public int next() {
        if(st.isEmpty()) return -1;
       TreeNode curr=st.pop();
       int temp=curr.val;
       dfs(curr.right);
       return temp;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */