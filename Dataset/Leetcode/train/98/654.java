 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return judge(root.left,root.val,null) && judge(root.right,null, root.val);
    }

    private boolean judge(TreeNode root, Integer maxNow, Integer minNow){
        if(root == null) return true;
        if((maxNow == null || root.val < maxNow) && (minNow == null || root.val > minNow) &&
            judge(root.left,root.val,minNow) && judge(root.right,maxNow,root.val)) return true;
        return false;
    }
}

