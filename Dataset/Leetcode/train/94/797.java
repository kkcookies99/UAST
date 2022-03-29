 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.empty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
                continue;
            } 
            current = stack.pop();
            list.add(current.val);
            current = current.right;        
        }
        return list;
    }
}

