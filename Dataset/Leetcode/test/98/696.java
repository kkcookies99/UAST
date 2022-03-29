 class Solution {
    //i==0时为设置的初始值
    int pre = Integer.MIN_VALUE,i = 0;
    boolean left = true,right = true;
    public boolean XXX(TreeNode root) {
        if (root != null){
            left = XXX(root.left);
            if (i > 0 && root.val <= pre) return false;
            if(i == 0) i++;
            pre = root.val;
            right = XXX(root.right);
        }
        return left && right; 
    }
}

