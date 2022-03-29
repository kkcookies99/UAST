 class Solution {
    public int XXX(TreeNode root) {
        if (root != null) {
            if (root.left == null || root.right == null) {//根部只有一个孩子，则另一侧深度恒为1。此时应取有孩子一侧的深度
                return Math.max(getMinDepth(root.left, 1), getMinDepth(root.right, 1));
            } else {//根部有两个孩子，取两侧最小深度即可
                return Math.min(getMinDepth(root.left, 1), getMinDepth(root.right, 1));
            }
        } else
            return 0;
    }

    public int getMinDepth(TreeNode node, int dep) {
        if (node != null) {
            if (node.left != null && node.right != null) {//有两个孩子，取较小深度
                return Math.min(getMinDepth(node.left, dep + 1), getMinDepth(node.right, dep + 1));
            } else if (node.left != null || node.right != null) { //只有一个孩子，取较大深度
                return Math.max(getMinDepth(node.left, dep + 1), getMinDepth(node.right, dep + 1));
            } else {//没有孩子，则是叶子节点
                return dep + 1;
            }
        } else return dep;
    }
}

