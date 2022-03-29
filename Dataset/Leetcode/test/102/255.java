  public List<List<Integer>> XXX(TreeNode root) {
        ArrayList<List<Integer>> ret=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int count=1;
        while (!queue.isEmpty()){
            int tempcount=0;
            List<Integer> list=new ArrayList<>();
            while(count!=0) {
                TreeNode tn = queue.peek();
                queue.poll();
                if(tn==null){
                    count--;continue;
                }
                list.add(tn.val);
                queue.add(tn.left);
                queue.add(tn.right);
                tempcount=tempcount+2;
                count--;
            }
            count=tempcount;
            if(list.size()!=0) {
                ret.add(list);
            }
        }
        return ret;
    }

