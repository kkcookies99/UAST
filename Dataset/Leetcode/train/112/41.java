    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int sum = 0;
        return dfs(root,sum,targetSum);
    }
    private boolean dfs(TreeNode root,int sum,int targetSum){
        if(root.left == null && root.right == null) return (sum+root.val) == targetSum;
        sum+=root.val;
        boolean left = false,right = false;
        if(root.left !=null){
            left = dfs(root.left,sum,targetSum);
        }
        if(root.right !=null){
            right = dfs(root.right,sum,targetSum);
        }
        return left || right;
    }

