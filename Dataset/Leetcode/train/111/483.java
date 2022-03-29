class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left!=null&&root.right!=null){
            return 1+Math.min(XXX(root.left),XXX(root.right));
        }
        return 1+Math.max(XXX(root.left),XXX(root.right));
    }
}

