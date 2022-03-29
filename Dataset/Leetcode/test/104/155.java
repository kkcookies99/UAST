class Solution {
    public int XXX(TreeNode root) {
        return depth2(root);
    }

    // 递归实现
    private int depth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    // 迭代实现
    private int depth2(TreeNode root) {
        if(root == null) return 0;
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size;
        TreeNode tmp;
        while(!q.isEmpty()) {
            size = q.size();
            depth++;
            while(size > 0) {
                tmp = q.poll();
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right != null) q.offer(tmp.right);
                size--;
            }
        }
        return depth;
    }
}

