 class Solution {
    
    public List<Integer> XXX(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return ans;
        TreeNode node = root;
        while(!stack.empty() || node != null){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            ans.add(node.val);
            node = node.right;
        }
        return ans;
    }
}

