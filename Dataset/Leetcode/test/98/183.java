 class Solution {
    public boolean XXX(TreeNode root) {
        return inRange(root, null, null);
    }

    public boolean inRange(TreeNode node, Integer min, Integer max) {
        if (node == null)
            return true;
        return (min == null || node.val > min) // 无需比较最小值，或者满足
            && (max == null || node.val < max) // 无需比较最大值，或者满足
            && inRange(node.left, min, node.val) // 左子树介于最小值与自身之间
            && inRange(node.right, node.val, max); // 右子树介于最大值与自身之间
    }
}

