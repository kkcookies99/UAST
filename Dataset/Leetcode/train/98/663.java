 class Solution {
    TreeNode pre;
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean res;
        res = XXX(root.left);
        if(res == false){
            return false;
        }
        if(pre == null){
            pre = root;
        }else{
            if(pre.val >= root.val){
                return false;
            }
            pre.right = root;
            pre = root;
        }
        res = XXX(root.right);
        if(res == false){
            return false;
        }
        return res;
    }
}

