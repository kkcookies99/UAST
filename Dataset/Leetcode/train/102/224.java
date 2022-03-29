  public List<List<Integer>> XXX(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> results  = new ArrayList<>();
//        create a queue
        Queue<TreeNode> queue = new LinkedList<>();
//      add the first node
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while(count > 0){
                TreeNode node = queue.poll();
                list.add(node.val); // add the val of element
                if (node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                count --;
            }
            results.add(list);
        }
        return results;
    }

