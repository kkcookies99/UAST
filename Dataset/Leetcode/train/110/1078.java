 class Solution {
    public boolean XXX(TreeNode root) {
        return height(root) != -1;
    }
    
    int height(TreeNode t){
        if (t == null)
            return 0;
        int leftH = height(t.left);
        if (leftH == -1)
            return -1;
        int rightH = height(t.right);
        if (rightH == -1)
            return -1;
        if (Math.abs(leftH - rightH) > 1 )
            return -1;
        return 1 + Math.max(leftH,rightH);
    }
}

