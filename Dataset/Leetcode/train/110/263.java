class Solution {
    public boolean XXX(TreeNode root) {
        return dg(root) != -1;
    }

    public int dg(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int rd = dg(node.right);
        int ld = dg(node.left);
        if (rd == -1 || ld == -1) {
            return -1;
        }
        if (Math.abs(rd - ld) > 1) {
            return -1;
        }
        return rd > ld ? rd + 1 : ld + 1;
    }
}

