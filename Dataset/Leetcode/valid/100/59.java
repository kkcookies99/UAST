 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
       
        return perOrder(p,q);
    }
    public boolean perOrder(TreeNode p ,TreeNode q){
        boolean result = true;
        if(p==null&&q!=null || p!=null&& q == null){
            result = false;
        }else if(p==null&&q==null){
            return true;
        }
        if(result && p.val!=q.val){
            result = false;
        }
        if(result){
            result = perOrder(p.left, q.left);
        }
        if(result){
            result = perOrder(p.right, q.right);
        }
        return result;
    }
}

