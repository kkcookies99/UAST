public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root  == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int lenNow = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < lenNow; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(list);
        }
        return res;
    }

