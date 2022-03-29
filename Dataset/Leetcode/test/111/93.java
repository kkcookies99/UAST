    public int XXX(TreeNode root) {
        int dep = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        if (root != null){
            deque.addLast(root);
        }
        while (!deque.isEmpty()){
            int len = deque.size();
            dep++;

            for (int i = 0; i < len; i++) {
                TreeNode node = deque.pop();

                if (node.left == null && node.right == null){
                    return dep;
                }

                if (node.left != null){
                    deque.add(node.left);
                }
                if (node.right != null){
                    deque.add(node.right);
                }
            }
        }
        return dep;
    }

