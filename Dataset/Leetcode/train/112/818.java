 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root != null)
        {
            sum -= root.val;

            if(root.left == null && root.right == null && sum == 0)
                return true;
            
            boolean leftFlag = XXX(root.left,sum);
            boolean rightFlag = XXX(root.right,sum);

            return leftFlag || rightFlag;
        }

        return false;
    }
}

