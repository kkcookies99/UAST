 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null ) return false;
        if(root.left==null && root.right==null){
            if(targetSum-root.val == 0) return true;
            else return false;
        } 
        boolean left =false;
        boolean right =false;
        if(root.left!=null){
             left = XXX(root.left,targetSum-root.val);
        }
        if(root.right !=null){
            right = XXX(root.right,targetSum-root.val);
        }
        return  left || right;
    }
}

