 class Solution {
    long preValue = Long.MIN_VALUE;
    public boolean XXX(TreeNode head) {
        if (head == null) return true;
        boolean isLeftValue = XXX(head.left);
        if (!isLeftValue) return false;
        if (preValue >= head.val) return false;
        else preValue = head.val;
        return XXX(head.right);
    }
}

