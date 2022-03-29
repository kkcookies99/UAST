 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(0, 0, root, false, false);
    }

    private boolean XXX(int max, int min, TreeNode curNode, boolean hasMax, boolean hasMin) {
        return curNode == null
                || (!hasMax || curNode.val < max) && (!hasMin || curNode.val > min)
                && XXX(curNode.val, min, curNode.left, true, hasMin)
                && XXX(max, curNode.val, curNode.right, hasMax, true);
    }
}

