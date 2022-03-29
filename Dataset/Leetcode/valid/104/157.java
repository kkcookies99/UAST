class Solution {
    public int XXX(TreeNode root) {
        int depth = 0;
        if(root == null){
            return depth;
        }
        depth++;
        return Math.max(depth + XXX(root.left),depth + XXX(root.right));
    }
}

