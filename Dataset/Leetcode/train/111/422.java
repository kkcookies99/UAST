class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;  
        return helper(root);
    }
    public int helper(TreeNode node){
        //排除节点为空的情况
        if(node == null)
           return 100000;
        //循环终止条件是当前节点为叶子节点   
        if(node.left==null && node.right==null)
            return 1;
        int lh = helper(node.left)+1;
        int lr = helper(node.right)+1;
        return Math.min(lh,lr);
    }
}

