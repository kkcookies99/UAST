 public boolean XXX(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (!queue.isEmpty() ||cur != null) {
            while (cur != null) {
                queue.push(cur);
                cur = cur.left;
            }
            cur = queue.pop();
            if (pre != null && pre.val >= cur.val) return false;
            pre = cur;
            cur = cur.right; 
        }
        return true;
    }

