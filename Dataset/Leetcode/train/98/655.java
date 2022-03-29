 class Solution {
    Integer last = null;
    public boolean XXX(TreeNode root) {
        if(root != null){
            if(!XXX(root.left)) return false;
            if(last != null && root.val <= last) return false;
            last = root.val;
            return XXX(root.right);
        }
        return true;
    }
}

