public int XXX(TreeNode root) {
        // 空的树
        if (root == null) return 0;

        // 记忆需要BFS的节点们,BFS需要Queue，
        Queue<TreeNode> q = new LinkedList<>();

        // 记录BFS的深度
        int level = 1;

        // 把第一个节点塞进去
        q.offer(root);

        // 开始对记忆中的节点们进行遍历
        while (!q.isEmpty()) {
            // 不空才开始对记忆中的节点们进行遍历
            // 不可以用高级for,会混乱
            int sz = q.size();
            for(int i = 0 ; i < sz; i++) {
                // 取出一个节点
                TreeNode current = q.poll();
                // 判断是不是目的节点：
                // 在本题里，目的节点满足两个孩子都是空的
                // 只要遇到满足的，就可以停了，因为自上而下
                if (current.left == null && current.right == null) {
                    return level;
                }

                // 把儿子们塞进队列
                if(current.left != null) {
                    q.offer(current.left);
                }

                if(current.right != null) {
                    q.offer(current.right);
                }
            }
            
            level++;
        }
        
        return level;
    }

