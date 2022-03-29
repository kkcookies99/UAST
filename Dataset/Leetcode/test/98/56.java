 class Solution {
    // 利用二叉搜索树的性质：中序遍历为升序
    TreeNode pre = null;
    public boolean XXX(TreeNode root){
        if(root == null){
            return true;
        }
        if(XXX(root.left)){
            if(pre == null || pre.val < root.val){
                pre = root;
                return XXX(root.right);
            }
        }
        return false;
    }
}

