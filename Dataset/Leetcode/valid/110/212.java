class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        int left = check(root.left);
        int right = check(root.right);
        if(Math.abs(right-left)>1) return false;
        return XXX(root.left)&&XXX(root.right);

    }

    public int check(TreeNode root){
        if(root==null) return 0;
        return Math.max(check(root.left),check(root.right))+1;
    }
}

