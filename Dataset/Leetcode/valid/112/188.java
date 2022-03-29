 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) {
            if(sum == 0)
                return true;
            else
                return false;
        }
        return XXX(root.left,sum - root.val) || XXX(root.right,sum - root.val);
    }
}

