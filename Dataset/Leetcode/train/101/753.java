 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        if(fun(root.left, root.right)){
            return true;
        }
        return false;
    }
    public boolean fun(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left !=null && right!=null 
            && left.val==right.val 
            && fun(left.left,right.right) && fun(left.right, right.left)){
            return true;
        }
        return false;
    }
}

