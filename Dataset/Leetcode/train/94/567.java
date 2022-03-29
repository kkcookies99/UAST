 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Deque<TreeNode> s = new LinkedList<TreeNode>();
        HashMap<TreeNode, Integer> visited = new HashMap<TreeNode, Integer>();
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) return l;
        TreeNode t = root;
        do {
            // 是否可以访问左子节点
            if (t.left != null && visited.get(t.left) == null) {
                s.push(t);
                t = t.left;
                continue;
            }
            // 是否可以访问右子节点
            if (t.right != null && visited.get(t.right) == null) {
                if (visited.get(t) == null)
                    s.push(t);
                t = t.right;
                continue;
            }
            // 访问
            l.add(t.val);
            visited.put(t, 1);
            if (s.isEmpty())
                break;
            t = s.pop();
        } while (t.left != null || t.right != null || !s.isEmpty());
        if (visited.get(t) == null)
            l.add(t.val);
        return l;
    }
}

