public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        if(root != null) q.addLast(root);
        while(!q.isEmpty())
        {
            List<Integer> level = new ArrayList<>();
            int len = q.size();
            while(len -- > 0)
            {
                var t = q.poll();
                level.add(t.val);
                if(t.left != null) q.addLast(t.left);
                if(t.right!= null) q.addLast(t.right);
            }
            res.add(level); 
        }
        return res;
    }
