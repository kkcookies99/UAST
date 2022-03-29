class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        //左右子树高度差小于1
        if(Math.abs(depth(root.left)-depth(root.right))<=1){
            //左右子树高度差小于1且左右子树都是平衡树
            if(XXX(root.left)&&XXX(root.right))return true;
            else return false;
        }
        else return false;
    }
    //求树的高度
    public int depth(TreeNode root){
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return 1;
        if(root.left==null&&root.right!=null)return depth(root.right)+1;
        if(root.left!=null&&root.right==null)return depth(root.left)+1;
        return Math.max(depth(root.right),depth(root.left))+1;
    }
}

