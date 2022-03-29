class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        int leftHigh = 0;
        int rightHigh = 0;
        if(root.left != null){
            if(XXX(root.left)){
                leftHigh = getDepth(root.left);
            }else{
                return false;
            }
        }
        if(root.right != null){
            if(XXX(root.right)){
                rightHigh = getDepth(root.right);
            }else{
                return false;
            }
        }
        if(Math.abs(leftHigh - rightHigh) > 1) return false;
        return true;
    }

    public int getDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}

