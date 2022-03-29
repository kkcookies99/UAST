  public int XXX(TreeNode root) {
        class DequeNode{
            TreeNode node;
            int depth;
            public DequeNode(TreeNode node, int depth) {this.node = node; this.depth = depth;}
            public DequeNode(int depth){this.depth = depth;}
        }
        // 如果root为空的话就进行返回
        if(root == null) return 0;
        Deque<DequeNode> queue = new LinkedList<>();
//        存入的就是一个值
        queue.offer(new DequeNode(root, 1));
        while( ! queue.isEmpty()){
            DequeNode dequeNode = queue.poll();
            int depth = dequeNode.depth;
//          判断left和right是否是为空
            if(dequeNode.node.left != null ){
                queue.offer(new DequeNode(dequeNode.node.left, depth + 1));
            }
            if(dequeNode.node.right != null){
                queue.offer(new DequeNode(dequeNode.node.right, depth + 1));
            }
//            如果当前是叶子节点，返回
            if(dequeNode.node.left == null && dequeNode.node.right == null) {
                return dequeNode.depth;
            }
        }
        return 0;
    }

