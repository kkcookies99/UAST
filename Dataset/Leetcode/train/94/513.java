 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null) {
                if( root!= null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    list.add(root.val);
                    root = root.right;
                }
            }
        }
        return list;
    }
}

