 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null)
            return false;
        sum-=root.val;
        if(root.left==null&&root.right==null&&sum==0)
            return true;
        return XXX(root.left,sum)||XXX(root.right,sum);
    }
}

