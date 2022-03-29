 class Solution {
    public boolean XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> inorder = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while(root!=null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            inorder.add(root.val);
            root = root.right;
        }
        long pre = Long.MIN_VALUE;
        while (!inorder.isEmpty()) {
            int val = inorder.pollFirst();
            if(val>pre) {
                pre = val;
            } else {
                return false;
            }
        }
        return true;
    }
}

