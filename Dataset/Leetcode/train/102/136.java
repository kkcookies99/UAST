class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        // BFS 广度优先遍历

        // 使用队列记录当前节点，然后遍历输出，并将节点的左右子树加入队列中

        // 关键问题，如何判断队列中某一个节点是当前层的最后一个节点呢？
        // 解决：遍历队列时，先获取队列的长度，再进行指定长度队列节点的遍历

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            // 队列的长度
            int len = queue.size();
            // 当前层的数据
            List<Integer> list = new ArrayList<>();
            // 遍历当前队列里的节点
            for (int i = 0; i < len; i++) {
                TreeNode t = queue.poll();
                list.add(t.val);
                
                // 添加左右子树(孩子节点)
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            res.add(list);
        }

        return res;
    }
}

