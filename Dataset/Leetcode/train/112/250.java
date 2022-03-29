 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        
        boolean ans = dfs(root, 0, targetSum);

        return ans;
    }

    public boolean dfs(TreeNode node, int sum, int targetSum){
        // 根左右
        sum += node.val;
        if(node.left == null && node.right == null){
            if(sum == targetSum){
                return true;
            } else {
                return false;
            }
        }

        boolean left = false;
        if(node.left != null){
            left = dfs(node.left, sum, targetSum);
        }

        boolean right = false;
        if(node.right != null){
            right = dfs(node.right, sum, targetSum);
        }
        
        boolean mid = left || right;
        return mid;
    }
}

