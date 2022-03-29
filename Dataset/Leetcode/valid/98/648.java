 class Solution {
    public boolean XXX(TreeNode root) {
        return ivb(root, Integer.MIN_VALUE, Integer.MAX_VALUE, false, false);
    }
    public static boolean ivb(TreeNode root, int min, int max, boolean minValid, boolean maxValid) {
        if (root == null)
            return true;
        if (minValid && maxValid) {
            if (root.val >= max || root.val <= min)
                return false; 
            return ivb(root.left, min, root.val, true, true) && ivb(root.right, root.val, max, true, true);
        } else if (!minValid && maxValid) {
            if (root.val >= max)
                return false;
            return ivb(root.left, min, root.val, false, true) && ivb(root.right, root.val, max, true, true);
        } else if (minValid && !maxValid) {
            if (root.val <= min)
                return false;
            return ivb(root.left, min, root.val, true, true) && ivb(root.right, root.val, max, true, false);
        } else {
            return ivb(root.left, min, root.val, false, true) && ivb(root.right, root.val, max, true, false);
        }
    }
}

