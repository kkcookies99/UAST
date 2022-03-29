 class Solution {
    long value = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) { 
        return nodetest(root);
    }

    public boolean nodetest(TreeNode node) {
        if (node.left != null) {
            if (!nodetest(node.left)) {
                return false;
            }
        }
        if (node.val > value) {
            value = node.val;
        } else {
            return false;
        }
        if (node.right != null) {
            if (!nodetest(node.right)) {
                return false;
            }
        }
        return true;
    }

    
}

