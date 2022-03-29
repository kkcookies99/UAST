 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root, null, null);
    }

    private boolean XXX(TreeNode root, TreeNode min, TreeNode max){
        if (root == null){
            return true;
        }

        // 如果max不为空说明此时判断的是左子树，左子树要保证比上方所有root值小
        if (max != null && root.val >= max.val){
            return false;
        }
        // 如果min不为空说明此时判断的是右子树，右子树要保证比之前所有的root值大
        if (min != null && root.val <= min.val){
            return false;
        }
        // 分别递归左右子树并设置min/max
        return XXX(root.left, min, root) && XXX(root.right, root, max);
    }
}

