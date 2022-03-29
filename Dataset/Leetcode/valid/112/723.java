 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        return  toLeaf(root,sum);
    }
    public  boolean toLeaf(TreeNode root, int sum){
        if(root==null)
            return false;
        if(root.val==sum&&root.left==null&&root.right==null){
            return true;
        }else{
            return toLeaf(root.left,sum-root.val)||toLeaf(root.right,sum-root.val);
        }
    }
}

