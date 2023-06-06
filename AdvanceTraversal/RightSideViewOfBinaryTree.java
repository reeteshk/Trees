/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer>al=new ArrayList<>();
         rightv(node,0,al);
         return al;
    }
    public void rightv(Node node,int level,ArrayList<Integer>al)
    {
        if(node==null)
        {
            return;
        }
        if(level==al.size())
        {
            al.add(node.data);
        }
        rightv(node.right,level+1,al);
        rightv(node.left,level+1,al);
    }
    
    
}