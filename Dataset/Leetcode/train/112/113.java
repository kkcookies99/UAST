class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        //记录路径和
        int sum = 0;
        //用数组做引用值
        boolean[] res = {false};
        dfs(root, sum, targetSum, res);
        return res[0];
        
    }
    
    public void dfs(TreeNode node, int sum, int target, boolean[] res){
        //如果为叶子节点，判断当前sum+叶子节点的值是否等于target，等于则将结果改为true
        if(node.left == null && node.right == null){
            if(sum + node.val == target){
                res[0] = true;
            }
        }
        //如果为非叶子节点，sum+上当前节点的值
        sum = sum + node.val;
        //递归当前节点的左、右子节点
        if(node.left != null){
            dfs(node.left, sum, target, res);
        }
        if(node.right != null){
           dfs(node.right, sum, target, res); 
        }
    }
}

