class Solution {
    public int XXX(TreeNode root) {
        if (root == null){
            return 0;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        int depth = 1;

        while (!queue.isEmpty()){
            // 此处必须使用一个新的sz取出queue.size，不然每次循环queue的size在变，for循环的结束条件也跟着变！！
            int sz = queue.size();
            for (int i = 0; i < sz; i++){
                TreeNode cur = queue.removeFirst();
                if (cur.left == null && cur.right == null){
                    return depth;
                }
                if (cur.left != null){
                    queue.addLast(cur.left);
                }
                if (cur.right != null){
                    queue.addLast(cur.right);
                }
            }
            depth++;
        }
        return -1;
    }
}

