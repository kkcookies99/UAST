class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        List<Integer> temp = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0, count = 1;
        TreeNode cur;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            temp.add(cur.val);
            count--;
            if (cur.left != null) {
                queue.offer(cur.left);
                size++;
            }
            if (cur.right != null) {
                queue.offer(cur.right);
                size++;
            }

            if (count == 0) {
                count = size;
                size = 0;
                result.add(temp);
                temp = new LinkedList<>();
            }
        }
        return result;
    }
}

