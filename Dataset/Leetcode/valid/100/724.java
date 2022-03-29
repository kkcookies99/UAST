 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null){
            return middleOrder(p,q);
        }else{
            return check(p,q);
        }
    }

    private boolean middleOrder(TreeNode p,TreeNode q){
        //中序遍历
        boolean flag = true;
        if(p!=null&&q!=null){
            if(p.left!=null&&q.left!=null){
                flag = flag && middleOrder(p.left,q.left);
            }else{
                flag = flag && check(p.left,q.left);
            }

            if(p.val!=q.val){
                return false;
            }

            if(p.right!=null&&q.right!=null){
                flag = flag && middleOrder(p.right,q.right);
            }else{
                flag = flag && check(p.right,q.right);
            }
        }
        return flag;
    }

    private boolean check(TreeNode p,TreeNode q){
        if(p==null&&q!=null){
            return false;
        }else if(p!=null&&q==null){
            return false;
        }
        return true;
    }
}

