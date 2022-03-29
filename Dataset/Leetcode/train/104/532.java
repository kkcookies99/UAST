class Solution {
    public int XXX(TreeNode root) {
        if(root==null)
            return 0;
        else
            return XXX(root.left)>XXX(root.right)? XXX(root.left)+1:XXX(root.right)+1 ;
    }
}

