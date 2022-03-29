class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            //将该层的所有节点对应的值添加入temp中
            int cur_size = queue.size();
            for(int i=0;i<cur_size;i++){
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
            res.add(temp);
        } 
        return res;
    }
}

