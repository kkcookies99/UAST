 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return this.compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right){
        if(left==null && right!=null){
            return false;
        }else if(left !=null && right == null){
            return false;
        }else if(left == null && right == null){
            return true;
        }else if(left.val != right.val){
            return false;
        }
        boolean isSide = compare(left.left,right.right);
        boolean isOuter = compare(left.right,right.left);
        return isOuter && isSide;
    }
}

