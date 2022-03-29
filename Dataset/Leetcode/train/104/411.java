class Solution {
    public int XXX(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = XXX(root.left) + 1; //左侧深度
        int right = XXX(root.right) + 1;  //右侧深度
        return Math.max(left, right);  //从中选择最大的一个
    }
}

