 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        Stack<TreeNode> t1=new Stack<>();
        Stack<TreeNode> t2=new Stack<>();
        if(p!=null&&q!=null)
        {
           t1.push(p);
            t2.push(q); 
        }
        else if(p==null&&q==null)return true;
        else return false;
        while(!t1.empty()&&!t2.empty())
        {
            TreeNode cur1=t1.pop();
            TreeNode cur2=t2.pop();
            if(cur1.val!=cur2.val)return false;
            if(cur1.left!=null&&cur2.left!=null)
            {
                t1.push(cur1.left);
                t2.push(cur2.left);
            }
            else if(cur1.left==null&&cur2.left==null){}
            else return false;
            if(cur1.right!=null&&cur2.right!=null)
            {
                t1.push(cur1.right);
                t2.push(cur2.right);
            }
            else if(cur1.right==null&&cur2.right==null){}
            else return false;
        }
        return true;
    }
}

