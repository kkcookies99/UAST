public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        while (!queue.isEmpty()){
            
            int size = queue.size();
            if(size > 0){
                List<Integer> sons = new ArrayList<>();
                for(int i = 0;i < size; i++){
                    TreeNode node = queue.poll();
                    if(node != null){
                        sons.add(node.val);
                        if(node.left != null){
                            queue.add(node.left);
                        }
                        if(node.right != null){
                            queue.add(node.right);
                        }

                    }
                }
                list.add(sons);
            }
        }


        return list;
    }

