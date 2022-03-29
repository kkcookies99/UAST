 class Solution {
    public boolean XXX(TreeNode root) {
        TreeNode ptr = root, pre = null, p = null;

        while (ptr != null) {
            pre = ptr.left;
            if (pre != null) {
                while (pre.right != null && pre.right != ptr) pre = pre.right;
                if (pre.right == null) {
                    pre.right = ptr;
                    ptr = ptr.left;
                    continue;
                } else {
                    pre.right = null;
                }
            } 
            if (p == null || p.val < ptr.val) p = ptr;
            else if (p.val >= ptr.val) return false; 
            ptr = ptr.right;
        }

        return true;
    }
}

