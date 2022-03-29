 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        while (root != null || !q.isEmpty()) {
            while (root != null) {
                q.push(root);
                root = root.left;
            }
            root = q.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}

