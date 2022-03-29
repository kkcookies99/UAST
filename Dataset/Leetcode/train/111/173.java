public int XXX(TreeNode root) {
        if(root == null) {
            return 0;
        }
        //层序遍历，某个节点没有左右节点，就返回当前层数
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i =0;i< size;i++) {
                TreeNode tempNode = queue.poll();
                if(tempNode.left == null && tempNode.right == null) {
                    return level;
                }
                if(tempNode.left!=null) {
                    queue.add(tempNode.left);
                }
                if(tempNode.right!=null) {
                    queue.add(tempNode.right);
                }
            }
            level++;
        }
        return level;
    }

