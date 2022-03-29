class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return Math.abs(findHeight(root.left)-findHeight(root.right)) <= 1 && XXX(root.left) && XXX(root.right);

    }

    //辅助方法，寻找数的高度
    int findHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(findHeight(root.left),findHeight(root.right));

    }

}

