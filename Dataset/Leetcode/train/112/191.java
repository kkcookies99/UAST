 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root!=null){
            if(root.left==null&&root.right==null){
                return targetSum-root.val==0?true:false;
            }

            return XXX(root.left,targetSum-root.val)||XXX(root.right,targetSum-root.val);
        }
        return false;

    }
}

