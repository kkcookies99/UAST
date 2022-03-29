    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int sum = 0;
        return dfs(root,sum,targetSum);
    }
    private boolean dfs(TreeNode root,int sum,int targetSum){
        if(root == null) return sum == targetSum;
        sum+=root.val;
        return dfs(root.left,sum,targetSum) || dfs(root.right,sum,targetSum);
    }

