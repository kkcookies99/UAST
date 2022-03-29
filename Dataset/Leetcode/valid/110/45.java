class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null)
            return true;
        // 左右两个子树的高度差的绝对值超过1  不平衡
        if(Math.abs(count(root.left) - count(root.right)) > 1)
            return false;
        // 递归遍历左右孩子结点 是否都满足此性质
        return XXX(root.left) && XXX(root.right);
        
    }
    // 计算以node为根的树的高度
    public int count(TreeNode node){
        if(node == null)
            return 0;
        // 叶子结点
        if(node.left == null && node.right == null)
            return 1;
        return Math.max(count(node.left), count(node.right)) + 1;
    }
}

