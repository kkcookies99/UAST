class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            while(len > 0) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null) return depth; //遇到的第一个叶子节点，直接返回
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                len--;
            }
            depth++;
        }
        return depth;
    }
}

