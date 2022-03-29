public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            
                List<Integer> level = new ArrayList<>();
                for(;count > 0;){
                    TreeNode node = queue.poll();
                    if(node != null){
                        level.add(node.val);
                        queue.offer(node.left);
                        queue.offer(node.right);
                    }
                
                    count--;
                }
            
                if(!level.isEmpty())
                    result.add(level);
            
        }
        return result;
    }

