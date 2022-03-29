 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root != null) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            }
            else {
                root = stack.pop();
                answer.add(root.val);
                root = root.right;
            }
        }

        return answer;
    }
}

