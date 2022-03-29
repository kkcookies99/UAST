 class Solution {
    
    /**
     * 左右子树需要贡献的信息全集
     */
    class TreeInfo {
        boolean isBST;
        long min;
        long max;
    
        public TreeInfo(boolean isBST, long min, long max) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
        }
    }
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return treeInfo(root).isBST;
    }
    
    
    public TreeInfo treeInfo(TreeNode root) {
        
        if (root.left == null && root.right == null) {
            return new TreeInfo(true,root.val,root.val);
        }
    
        boolean isBST = false;
        long min;
        long max;
        if (root.right != null && root.left != null) {
            TreeInfo leftInfo = treeInfo(root.left);
            TreeInfo rightInfo = treeInfo(root.right);
    
            isBST = leftInfo.isBST && rightInfo.isBST && (root.val > leftInfo.max && root.val < rightInfo.min);
            min = Math.min(leftInfo.min,root.val);
            max = Math.max(root.val,rightInfo.max);
            return new TreeInfo(isBST,min,max);
        }
        
        if (root.right != null) {
            TreeInfo rightInfo = treeInfo(root.right);
            isBST = rightInfo.isBST && (root.val < rightInfo.min);
            min = root.val;
            max = rightInfo.max;
            return new TreeInfo(isBST,min,max);
        }
    

        TreeInfo leftInfo = treeInfo(root.left);
        isBST = leftInfo.isBST && (root.val > leftInfo.max);
        min = leftInfo.min;
        max = root.val;
        return new TreeInfo(isBST,min,max);
    
    }
}

