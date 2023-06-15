class Solution{


public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
     if (root == null)
            return;

        // If key is present at root
        if (root.data == key) {
            // The maximum value in the left subtree is the predecessor
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null)
                    temp = temp.right;
                pre = temp;
            }

            // The minimum value in the right subtree is the successor
            if (root.right != null) {
                Node temp = root.right;
                while (temp.left != null)
                    temp = temp.left;
                suc = temp;
            }
            return;
        }

        // If key is smaller than root's key, go to the left subtree
        if (root.data > key) {
            suc = root;
            findPreSuc(root.left, key);
        }
        // If key is greater than root's key, go to the right subtree
        else {
            pre = root;
            findPreSuc(root.right, key);
        }
}
}