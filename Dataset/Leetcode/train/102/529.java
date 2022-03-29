    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        if(root ==null) return res;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=1 ;i<size ;i++){
                TreeNode tn= queue.poll();
                if(tn.left !=null ) queue.offer(tn.left);
                if(tn.right !=null) queue.offer(tn.right);
                list.add(tn.val);
            }
            res.add(list);
        }
        return res;
    }

