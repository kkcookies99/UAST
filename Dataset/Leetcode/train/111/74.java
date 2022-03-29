class Solution {
    
    public int XXX(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null||root.right==null)
            return Math.max(XXX(root.left)+1,XXX(root.right)+1);
        return Math.min(XXX(root.left)+1,XXX(root.right)+1);
    }
}

