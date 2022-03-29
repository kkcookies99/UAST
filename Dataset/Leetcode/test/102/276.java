 public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        Queue<TreeNode> ret=new LinkedList<TreeNode>();
        q.offer(root);
        List<Integer> list=new ArrayList<Integer>();
        list.add(root.val);
        ans.add(list);
        list=new ArrayList<Integer>();
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur.left!=null){
                list.add(cur.left.val);
                ret.offer(cur.left);
            }
            if(cur.right!=null){
                list.add(cur.right.val);
                ret.offer(cur.right);
            }
            if(q.isEmpty()&&list.size()!=0){
                ans.add(list);
                list=new ArrayList<Integer>();
            }
            if(q.isEmpty()&&!ret.isEmpty()){
                while(!ret.isEmpty()){
                    q.offer(ret.poll());
                }
            }

        }
        return ans;
    }

