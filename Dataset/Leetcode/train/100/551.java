 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val == q.val) {
                if (XXX(p.left, q.left) && XXX(p.right, q.right)) {
                    return true;
                }
            }
        } else if (p == null && q == null) {
            return true;
        } 
        return false;
    }
}

