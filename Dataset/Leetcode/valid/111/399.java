public int XXX(TreeNode root) {
    if (root == null) return 0;
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    for (int depth = 1; ; depth++) {
        int size = queue.size();
        while (size-- > 0) {
            TreeNode poll = queue.poll();
            if (poll.left == null && poll.right == null) return depth;
            if (poll.left != null) queue.offer(poll.left);
            if (poll.right != null) queue.offer(poll.right);
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


