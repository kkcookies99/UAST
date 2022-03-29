     public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        Queue<TreeNode> queue1 = new LinkedList<>(), queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll(), node2 = queue2.poll();
            if (node1.val != node2.val) return false;
            TreeNode left1 = node1.left, right1 = node1.right, left2 = node2.left, right2 = node2.right;
            if (left1 == null ^ left2 == null) return false; // 异或^，两个为不同结果时为1
            if (right1 == null ^ right2 == null) return false;
            if (left1 != null) queue1.offer(left1);
            if (right1 != null) queue1.offer(right1);
            if (left2 != null) queue2.offer(left2);
            if (right2 != null) queue2.offer(right2);
        }

        return true;
    }

