class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> nodes = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> childNodes = new LinkedList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                childNodes.add(cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }

            nodes.add(childNodes);
        }

        return nodes;
    }
   
}

