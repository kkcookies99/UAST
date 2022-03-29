 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return isSameTree(root.left, root.right);
    }
    
 `your inline code...` 
    //虽然名字是same，但其实只是比较根结点相同，再比较node1的左子树和node2的右子树，两个子树的根节点相同，再比较....
    public boolean isSameTree(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;
        if(node1.val != node2.val) return false;
        return isSameTree(node1.left, node2.right) && isSameTree(node1.right, node2.left);
    }
}

