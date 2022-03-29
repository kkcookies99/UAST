 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new LinkedList();
        if(root == null) {
            return result;
        }
        Deque<TreeNode> stack = new ArrayDeque();
        TreeNode helper = root;
        while(helper != null || !stack.isEmpty()) {
            if(helper != null) {
                stack.offerLast(helper);
                helper = helper.left;
            } else {
                //helper == null时，代表以栈顶元素为根节点的左子树已经遍历完成，现在遍历其右子树
                helper = stack.pollLast();
                result.add(helper.val);
                helper = helper.right;
            }
        }
        return result;
    }
}

