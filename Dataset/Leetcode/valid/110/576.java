class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return helper(root);
    }
    private boolean helper(TreeNode root){
        if(root == null){
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        //判读根节点是否平衡，不平衡直接返回false,否则继续递归检查子树
        return Math.abs(left - right) <= 1 && helper(root.left) && helper(root.right);
    }
    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


