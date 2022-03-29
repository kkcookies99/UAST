 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        /* 广度优先 */
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            /* 每次迭代都是二叉树的一行 */
            List<Integer> row = new LinkedList<>();
            int size = queue.size();
            // 因为当前行的左右子节点也不断的往队列里面加,所以要控制每行取的次数
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                row.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            result.add(row);
        }

        return result;
    }
   
}

