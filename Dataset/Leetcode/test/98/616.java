 class Solution {
    public int temp;
    public int i;
    public boolean flag;
    public boolean XXX(TreeNode root) {
        this.flag = true;
        this.temp = 0;
        this.i = 0;
        if(root == null) return true;
        dfs(root);
        if(flag) return true;
        else return false;
    }
    public void dfs(TreeNode root){
        if(root != null){
            dfs(root.left);
            if(i ==0){
                temp = root.val;
            }
            else {
                if(root.val <=temp){
                    flag = false;
                }
                    
                else temp = root.val;
            }
            i++;
            dfs(root.right);
        }
        
    }
}

