 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;//边界条件

        return test(root.left,root.right);
    }
    public boolean test(TreeNode r1,TreeNode r2){ //r1,r2分别存储镜像位置的两个节点
        //若两个节点均为空 则返回true
        if(r1==null && r2==null)    return true;
        //若只存在一个节点为空，则肯定不对称，返回false 
        if(r1==null || r2==null)    return false;
        //若两个节点值相等，则递归检查两个节点的左右子树是否对称
        return (r1.val==r2.val) && test(r1.left,r2.right) && test(r1.right,r2.left);
    }
}

