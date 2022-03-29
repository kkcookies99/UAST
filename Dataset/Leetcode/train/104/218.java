class Solution {
    public int XXX(TreeNode root) {
        if (root == null){
            return 0;
        }

        //调用递归一次加一次
        int left = XXX(root.left) + 1;
        int right = XXX(root.right) + 1;

        return Math.max(left, right);
    }
}

