 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root!=null&&root.left==null&&root.right==null) 
                   return sum==root.val;
        if(root==null) return false;
        return XXX(root.left,sum-root.val)||XXX(root.right,sum-root.val);
    }
}

