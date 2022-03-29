class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        } else if (root.left != null && root.right != null) {
            return 1 + Math.min(XXX(root.left), XXX(root.right));
        }else if (root.left != null){
            return 1 + XXX(root.left);
        }else{
            return 1 + XXX(root.right);
        }
    }
}

