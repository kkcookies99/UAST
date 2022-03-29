class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root==null)
            return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int currentsize=queue.size();
            for(int i=1;i<=currentsize;i++){
                list.add(root.val);
                TreeNode cur = queue.poll();
                if(cur.left!=null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
            }
            ret.add(list);
        }
       return ret;
    }
}


