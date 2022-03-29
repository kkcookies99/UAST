class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        TreeNode p, q;
        while(!stack1.isEmpty()) {
            List<Integer> list = new ArrayList<>(stack1.size());
            while(!stack1.isEmpty()) {
                p = stack1.pop();
                list.add(p.val);
                stack2.push(p);
            }
            ans.add(list);
            while(!stack2.isEmpty()) {
                q = stack2.pop();
                if(q.right != null) {
                    stack1.push(q.right);
                }
                if(q.left != null) {
                    stack1.push(q.left);
                }
            }
        }
        return ans;
    }
}

