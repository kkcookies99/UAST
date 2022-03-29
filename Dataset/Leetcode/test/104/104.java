class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;

        int depth = 0;
        Queue<TreeNode> seq = new LinkedList<TreeNode>();
        seq.offer(root);

        while(!seq.isEmpty()) {
            int len = seq.size();
            for(int i = 0; i < len; i++) {
                TreeNode node = seq.poll();
                if(node.left != null) seq.offer(node.left);
                if(node.right != null) seq.offer(node.right);
            }
            depth++;
        }

        return depth;
    }
}

