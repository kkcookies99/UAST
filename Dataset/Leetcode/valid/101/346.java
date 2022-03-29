 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left,root.right);
    }

    public boolean isSame(TreeNode node1, TreeNode node2){
        if(node1 == null) return node2 == null;
        if(node2 == null) return node1 == null;

        if(node1.val == node2.val){
            Boolean flag1 = isSame(node1.left,node2.right);
            Boolean flag2 = isSame(node1.right,node2.left);
            return flag1 && flag2;
        }
        return false;
    }
}

