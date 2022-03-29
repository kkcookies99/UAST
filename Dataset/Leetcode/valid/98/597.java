 class Solution {
    public boolean dfs(TreeNode root, Integer minValue, Integer maxValue){
        if(root == null){
            return true;
        }
        if(maxValue != null){
            if(root.val >= maxValue){
                return false;
            }
        }
        if(minValue != null){
            if(root.val <= minValue){
                return false;
            }
        }
        return dfs(root.left, minValue,  root.val) && dfs(root.right, root.val, maxValue);
    }
    public boolean XXX(TreeNode root) {
        if(root == null){
           return true; 
        }
        return dfs(root, null, null);
    }
}

