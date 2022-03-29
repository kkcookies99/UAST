class Solution {
    public int XXX(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null &&root.right==null)return 1;
        return getDepth(root,1);
    }
    public int getDepth(TreeNode root,int depth){
        if(root==null)return depth;
        if(root.left!=null || root.right!=null)return Math.max(getDepth(root.left,depth+1),getDepth(root.right,depth+1));
        return depth;
    }
}

