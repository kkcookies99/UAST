 class Solution {
    long last = -2147483649l;
    public boolean XXX(TreeNode root) {
        if(root!=null){
            if(!XXX(root.left))
                return false;
            if(root.val<=last)
                return false;
            last=root.val;
            if(!XXX(root.right))
                return false;
        }
        return true;
    }
}

