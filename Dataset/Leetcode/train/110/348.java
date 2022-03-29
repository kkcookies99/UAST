class Solution {
    public boolean XXX(TreeNode root) {
        return height(root)>=0;//如果树高不是-1，说明是平衡树
    }
    //计算左右子树的高度差，一旦以某节点为头的不是平衡的，那么它上面的父辈节点也都不是平衡的，
    public int height(TreeNode root){
        if(root==null) return 0;
        //计算左子树，计算右子树
        int leftHeight=height(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight=height(root.right);
        if(rightHeight==-1||Math.abs(leftHeight-rightHeight)>1) return -1;//表示不是平衡树
        else return Math.max(leftHeight,rightHeight)+1;//否则，树高为左右子树较大值+1
    }
}

