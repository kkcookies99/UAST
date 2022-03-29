    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        int max=777;//厂长之数作为标记（可以用MAX_VALUE 理论上更合适 但是还是有缺陷 ；换用count计数每层个数更合适 时间也跟高，不过总体都是O(N)
        TreeNode specialVal=new TreeNode(max);

        queue.add(root);
        queue.add(specialVal);
         
        while(!queue.isEmpty())
        {
            if(queue.peek().left!=null) queue.add(queue.peek().left);
            if(queue.peek().right!=null) queue.add(queue.peek().right);

            if(queue.peek().val!=max) list.add(queue.peek().val);
            else if(queue.peek().val==max)
            {
                res.add(new ArrayList(list));
                list.clear();
                if(queue.size()>1) queue.add(specialVal);
            }
            queue.remove();
        }
        return res;

