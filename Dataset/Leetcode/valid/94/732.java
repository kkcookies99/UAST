 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
        while(!stack.empty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.right!=null){
                TreeNode tmp = node.right;
                while(tmp!=null){
                    stack.push(tmp);
                    tmp = tmp.left;
                }
            }
        }
        return result;
    }
}

