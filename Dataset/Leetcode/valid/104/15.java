public static int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int preCount = 1;
        int pCount = 0;

        int level = 0;

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            preCount--;

            if (temp.left != null) {
                q.offer(temp.left);
                pCount++;
            }
            if (temp.right != null) {
                q.offer(temp.right);
                pCount++;
            }

            if (preCount == 0) {
                preCount = pCount;
                pCount = 0;
                // System.out.println();
                level++;
            }
        }
        return level;
    }

