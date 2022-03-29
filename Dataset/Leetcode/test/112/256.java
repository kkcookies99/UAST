 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        if((root.left==null&&root.right==null)&&root.val==targetSum)
            return true;
        boolean flag=XXX(root.left,targetSum-root.val);
        if(flag)
            return true;
        flag=XXX(root.right,targetSum-root.val);
        return flag;
    }
}

