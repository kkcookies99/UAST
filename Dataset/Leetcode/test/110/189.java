class Solution {
    public boolean XXX(TreeNode root) {
        int ans = dfs(root);
        if(ans == -1){
            return false;
        } else {
            return true;
        }
    }

    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = dfs(node.left);
        if(leftHeight == -1){
            return -1;
        }

        int rightHeight = dfs(node.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        } else {
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }
}

