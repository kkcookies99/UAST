class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        int sum = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node);
                sum += node.val;
                node = node.left;
            }
            if(!stack.isEmpty()){
                node = stack.pop();
                if(node.left == null && node.right == null){
                    if(sum == targetSum) return true;
                    else sum -= node.val;
                }
                node = node.right;
            }
        }
        return false;
    }
}

