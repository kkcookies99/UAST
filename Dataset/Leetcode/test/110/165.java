class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;//空树
        if(Math.abs(depth(root.left)-depth(root.right))>1) return false; //左右子树高度差不大于1
        return XXX(root.left)&&XXX(root.right);//左右子树也是搜索二叉树
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}

