 class Solution {
    Long prev = Long.MIN_VALUE;
    boolean flag = true;
    public boolean XXX(TreeNode root) {
      if(root == null){
          return false;
      }
      dfs(root);
      return flag;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(root.val <= prev){
            flag = false;
        }
        prev =  Long.valueOf(root.val);
        dfs(root.right);
    }
}

