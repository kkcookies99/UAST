 class Solution {
    // 作为虚拟前驱
    double predecesser = Double.NEGATIVE_INFINITY;
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        
        boolean leftValid = XXX(root.left);

        // 非法判断
        if (root.val <= predecesser)
            return false;
        // 既然已经完成了该节点访问 就成为了前驱
        predecesser = root.val;

        return leftValid && XXX(root.right); 
    }
}

