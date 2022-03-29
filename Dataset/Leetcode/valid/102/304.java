class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();        // 最外层的链表
        Queue<TreeNode> q = new LinkedList<>();                 //  BFS肯定要用到队列！
        if (root != null) q.offer(root);                  //   如果root不为空则可以入队
        while(!q.isEmpty()) {
            int size = q.size();                          // 当前队节点的个数
            List<Integer> level = new ArrayList<>();      // 用于存储每层节点的链表
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();                    // 出队
                level.add(cur.val);                         // 添加到链表中
                if(cur.left != null) q.offer(cur.left);     // 节点的左孩子是否存在，若存在则入队
                if(cur.right != null) q.offer(cur.right);   //  节点的右孩子是否存在，若存在则入队
            }
            res.add(level);                                 // 链表添加到最外层的大连表中，开始下一层的节点遍历
        }
        return res;
    }
}

