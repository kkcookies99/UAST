 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        return count(root, targetSum) > 0;
    }

    int count(TreeNode root, int sum) {
        //空节点
        if(root==null) return 0;

        //叶子节点
        if(root.left==null && root.right==null) {
            return sum==root.val?1:0;
        }
        
        // 非叶子节点
        int leftCount = count(root.left, sum-root.val);
        int rightCount = count(root.right, sum-root.val);
        
        return leftCount + rightCount;
    }

}

