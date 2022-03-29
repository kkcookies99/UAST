 public int XXX(TreeNode root) {
      if (root == null) {
            return 0;
        }
        int depth=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i <size ; i++) {
                TreeNode node=queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
         return depth;
}

