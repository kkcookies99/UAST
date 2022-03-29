 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (checkl(root.left, root.val) && checkr(root.right, root.val)) {
            return XXX(root.left) && XXX(root.right);
        }
        return false;
    }

    private boolean checkl(TreeNode lroot, int val) {
        if (lroot == null) {
            return true;
        }
        if (lroot.val < val) {
            return checkl(lroot.left, val) && checkl(lroot.right, val);
        }
        return false;
    }

    private boolean checkr(TreeNode rroot, int val) {
        if (rroot == null) {// leftnode is null
            return true;
        }
        if (rroot.val > val) {
            return checkr(rroot.left, val) && checkr(rroot.right, val);
        }
        return false;
    }
}

