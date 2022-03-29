class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return XXX(root.right)+1;//左孩子为空，那么叶子节点在右子树上
        if(root.right==null) return XXX(root.left)+1;
        return Math.min(XXX(root.left),XXX(root.right))+1;//如果左右子树均不为空，则返回较小值
    }
}

