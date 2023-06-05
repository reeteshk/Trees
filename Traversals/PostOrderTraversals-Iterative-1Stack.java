public /*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        
        //using Double stack
        // Stack<Node>st1=new Stack<Node>();
        // Stack<Node>st2=new Stack<Node>();
        
        // ArrayList<Integer>ans=new ArrayList<>();
        // if(node==null) return ans;
        
        // st1.push(node);
        // while(!st1.isEmpty())
        // {
        //     Node temp=st1.pop();
        //     st2.push(temp);
        //     if(temp.left!=null)
        //     {
        //         st1.push(temp.left);
        //     }
        //     if(temp.right!=null)
        //     {
        //         st1.push(temp.right);
        //     }
            
        // }
        // while(!st2.isEmpty())
        // {
        //     Node temp=st2.pop();
        //     ans.add(temp.data);
        // }
        // return ans;
        
        Node cur=node;
        
        ArrayList < Integer > postOrder = new ArrayList < > ();
        if (cur == null) return postOrder;

        Stack < Node > st = new Stack < > ();
        while (cur != null || !st.isEmpty()) {

            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.data);
                    }
                } else cur = temp;
            }
        }
        return postOrder;
    }
} 
    
