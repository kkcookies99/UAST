class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int n = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            n++;
            while (size-- > 0) {
                TreeNode cur = q.poll();
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
                if (cur.right == null && cur.left == null) {
                    return n;
                }

            }
        }

        return n;
    }
}


