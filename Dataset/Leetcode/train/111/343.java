class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        int l=10000,r=10000;//初始化为很大的值
        if(root.left!=null) l=XXX(root.left); //如果左孩子为空，则终止迭代，因为不可能有叶子节点
        if(root.right!=null) r=XXX(root.right);
        return Math.min(l,r)+1;
    }
}

