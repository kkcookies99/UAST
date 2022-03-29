public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null)return res;
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList();
            for(int i=queue.size();i>0;i--){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }

