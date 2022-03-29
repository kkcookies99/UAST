class Solution {
    public int XXX(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        int XXX = 0;
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (size > 0) {
                XXX++;
            }
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                } 
                if (cur.right != null) {
                    queue.offer(cur.right);
                } 
                if (cur.left == null && cur.right == null) {  //遇到叶子节点
                    return XXX;
                }
            }
        }
        return XXX;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


