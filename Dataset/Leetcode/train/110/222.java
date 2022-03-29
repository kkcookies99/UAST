class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return XXX01(root) != -1;
    }

    public int XXX01(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = XXX01(root.left);
        int right = XXX01(root.right);

        if (left == -1 || right == -1){
            return -1;
        } else if (Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left,right) + 1;

    }
}

