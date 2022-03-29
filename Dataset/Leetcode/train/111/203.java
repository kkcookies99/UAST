class Solution {
    public int XXX(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        root.val = 1;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur.left == null && cur.right == null){
                return cur.val;
            }
            if (cur.left != null){
                cur.left.val = cur.val + 1;
                queue.add(cur.left);
            }
            if (cur.right != null){
                cur.right.val = cur.val + 1;
                queue.add(cur.right);
            }
        }
        return 0;
    }
}

