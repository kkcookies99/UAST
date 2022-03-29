 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null){
            return q == null;
        }
        if(q == null){
            return false;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(p);
        s2.push(q);
        while(!s1.isEmpty() && !s2.isEmpty()){
            p = s1.pop();
            q = s2.pop();
            if(p.val != q.val){
                return false;
            }
            //先入右节点
            if(p.right != null){
                if(q.right != null){
                    s1.push(p.right);
                    s2.push(q.right);
                }else{
                    return false;
                }
            }else{
                if(q.right != null){
                    return false;
                }
            }
            //再入左节点
            if(p.left != null){
                if(q.left != null){
                    s1.push(p.left);
                    s2.push(q.left);
                }else{
                    return false;
                }
            }else{
                if(q.left != null){
                    return false;
                }
            }
        }
        return true;
    }
}

