class Solution {
    public int XXX(TreeNode root) {
        return countDepth(root, 0);
    }

    public int countDepth(TreeNode root, int depth){
        if(root==null){
            return depth;
        }
        return Math.max(countDepth(root.left, depth+1), countDepth(root.right, depth+1));
    }
}

