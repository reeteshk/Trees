class Solution {
    ArrayList<Integer>al;
    public boolean findTarget(TreeNode root, int k) {
        al=new ArrayList<Integer>();
        inorderTraversal(root);

        int i=0;
        int a=al.size()-1;
        while(a>i)
        {
            if(al.get(i)+al.get(a)==k)
            {
                return true;
            }
            if(al.get(i)+al.get(a)>k)
            {
                a--;
            }
            else
            {
                i++;
            }
        }
        return false;

    }
    public void inorderTraversal(TreeNode root)
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