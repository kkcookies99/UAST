 class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.right!=null&&root.left!=null){
        int h=XXX(root.left);
        int l=XXX(root.right);
        return Math.min(h,l)+1;
        }
         int h=XXX(root.left);
        int l=XXX(root.right);
        return Math.max(h,l)+1;
    }

}

