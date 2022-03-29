class Solution {
    public int XXX(TreeNode root) {
        if(root==null)return 0;
        int left=XXX(root.left);
        int right=XXX(root.right);
        if(left==0)return 1+right;
        else if(right==0)return 1+left;
        else return 1+Math.min(right,left);
    }
}

