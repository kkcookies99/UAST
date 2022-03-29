 public boolean XXX(TreeNode p, TreeNode q) {
        boolean res = true;

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                res = false;
                break;
            }
            queue1.offer(node1.left);
            queue1.offer(node1.right);
            queue2.offer(node2.left);
            queue2.offer(node2.right);
        }
        return res;
    }

