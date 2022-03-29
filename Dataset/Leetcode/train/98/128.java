 class Solution {
    
    long pre_value = Long.MIN_VALUE;;  //需要设置为全局变量
    
    public boolean XXX(TreeNode root) {
        if(root == null) 
            return true;
        if(!XXX(root.left)) 
            return false;
        if(pre_value >= root.val) 
            return false;
        pre_value = root.val;  //设置为当前的值，然后与后面的进行比较
        return XXX(root.right);
    }
}

