 class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;//空树判断
        if(root.right == null && root.left == null) return 1;//结束标志

        if(root.left == null) return XXX(root.right) +1;//这里若左为空，则不计左侧的0长度
        if(root.right == null) return XXX(root.left) +1;//同理于上

        return Math.min(XXX(root.left),XXX(root.right)) +1 ;//左右节点都不为空，正常的返回
    }
}

