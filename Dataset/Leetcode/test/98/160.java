 class Solution {
    static long pre = Long.MIN_VALUE;
    public static boolean XXX(TreeNode p) {
        if (p != null) {
            if (!XXX(p.left))  return false;
            if (p.val <= pre) return false;
            pre = p.val;
            if (!XXX(p.right)) return false;
           
        }
        return true;
    } 
}

