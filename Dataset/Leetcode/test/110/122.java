class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null){
            return true;
        }
        int leftHight = getTreeHight(root.left);
        int rightHight = getTreeHight(root.right);
        if (Math.abs(leftHight - rightHight) > 1){
            return false;
        }
        return XXX(root.left) && XXX(root.right);
    }

    public int getTreeHight(TreeNode tree){
        int hight = 0;
        if (tree == null){
            return hight;
        }
        hight = 1 + Math.max(getTreeHight(tree.left), getTreeHight(tree.right));
        return hight;
    }
}

