import java.util.ArrayList;
import java.util.List;

class Pair{
    TreeNode node;
    int state;
    Pair(TreeNode node,int state){
        this.node = node;
        this.state = state;
    }
}
class Solution {

    public void PreInPostTraversal(TreeNode root) {
        Stack<Pair> stack = new Stack<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        stack.push(new Pair(root,1));
        if(root==null) return;
        while(!stack.isEmpty()){
            Pair p = stack.pop();
            if(p.state==1){
                pre.add(p.node.val);
                p.state++;
                stack.push(p);
                if(p.node.left!=null) stack.push(new Pair(p.node.left,1));
            }
            else if(p.state==2){
                in.add(p.node.val);
                p.state++;
                stack.push(p);
                if(p.node.right!=null) stack.push(new Pair(p.node.right,1));
            }
            else{
                post.add(p.node.val);
            }
        }
    }
}