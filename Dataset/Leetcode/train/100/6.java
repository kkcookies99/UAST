 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        // 递归
        if(p == null && q == null){
            // 全是null
            return true;
        }else if(p == null || q == null){
            // 两者之一为null
            return false;
        }else if(p.val != q.val){
            return false;
        }else{
            return XXX(p.left, q.left) && XXX(p.right, q.right);
        }
    }
}

