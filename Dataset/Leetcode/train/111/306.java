class Solution {
    public int XXX(TreeNode root) {
        int min=0;
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null) return min;
        queue.add(root);
        min=1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left==null&&node.right==null) return min;
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
            min++;
        }
        return min;
    }
}

