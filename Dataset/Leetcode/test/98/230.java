 class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root, Integer.MAX_VALUE, Integer.MIN_VALUE, true, true);
    }
    /**
     *
     * @param root：当前节点
     * @param preLeftMax：当出现了左右这种结构时，当前节点的父节点的值，因为当前节点右节点的值只能在当前节点值和当前节点父节点的值之间
     * @param preRightMin：当出现右左这种结构时，当前节点的父节点的值，因为当前节点的左节点的值只能在当前节点值和当前节点父节点的值之间
     * @param changePreLeftMax：判断是否出现了左右这种结构，只有出现了这种结构才能让preLeftMax生效
     * @param changePreRightMin：判断是否出现了右左这种结构，只有出现了这种结构才能让preRightMin生效
     * @return
     */
    public boolean dfs(TreeNode root, int preLeftMax, int preRightMin, boolean changePreLeftMax, boolean changePreRightMin) {
        if(root == null) {
            return true;
        }
        boolean left = true;
        boolean right = true;
        if(root.left != null) {
            if(root.left.val < root.val && (root.left.val > preRightMin || changePreRightMin)) {
                left = dfs(root.left, root.val, preRightMin, false, changePreRightMin);
            } else {
                return false;
            }
        }
        if(root.right != null) {
            if(root.right.val > root.val && (root.right.val < preLeftMax || changePreLeftMax)) {
                right = dfs(root.right, preLeftMax, root.val, changePreLeftMax, false);
            } else {
                return false;
            }
        }
        // 当前节点的左右子树都满足后，以当前节点为根节点的子树满足条件
        return left && right;
    }
}

