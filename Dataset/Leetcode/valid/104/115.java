class Solution {
    public int XXX(TreeNode root) {
        return getDepth(root,0);
    }
    
    private int getDepth(TreeNode root, int length) {
        if (root == null) return length;
        length++;
        int lLength = getDepth(root.left, length);
        int rLength = getDepth(root.right, length);
        if (lLength > rLength) {
            return lLength;
        } else {
            return rLength;
        }
    }
}

