 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;//讲道理root应该不会是null
        //但是最终题解就是要让你判定...，而且为空时认为是对称的
        return XXX(root.left,root.right);
    }
    public boolean XXX(TreeNode l,TreeNode r){
        if(l == null && r == null) return true;
        if(l == null || r == null) return false;
        if(l.val != r.val)  return false;
        return XXX(l.right,r.left) && XXX(l.left,r.right);
    }
}

