class Solution {
    public int XXX(TreeNode root) {
        // return (root == null) ? 0 : Math.max(XXX(root.left), XXX(root.right)) + 1;
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int height = 0;
        while (!queue.isEmpty()){
            height++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return height;
    }
}

