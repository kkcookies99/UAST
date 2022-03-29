class Solution {
    public int XXX(TreeNode root) {
        if(root == null)//空树为0
        return 0;
        if(root.left ==null && root.right==null)//只有一个根节点为1
        return 1;
        if((root.left!=null) && (root.right==null))//左子树非空，右子树为空，递归计算左子树
        return XXX(root.left)+1;
        if((root.left==null) && (root.right!=null))//左子树为空，右子树非空，递归计算右子树
        return XXX(root.right)+1;
        return Math.min(XXX(root.left),XXX(root.right)) +1;//二者取小

    }
}

