class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(root.left!=null){
            left = XXX(root.left)+1;
        }
        if(root.right!=null){
            right = XXX(root.right)+1;
        }
        return (left>right)?right:left;
    }
}

