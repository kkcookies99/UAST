 class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        //左子树为空,就检查右子树的最小深度,右子树为空,同理
        if(root.left==null) return XXX(root.right)+1;
        if(root.right==null) return XXX(root.left)+1;
        //返回两个子树中小的深度,在加上1(节点自己)
        return Math.min(XXX(root.left),XXX(root.right))+1;
    }
}

