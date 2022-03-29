 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)  return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(size-->0){
                TreeNode cur=q.poll();
                list.add(cur.val);
                if(cur.left!=null)
                    q.offer(cur.left);
                if(cur.right!=null)
                    q.offer(cur.right);
            }
            res.add(list);
        }
        return res;
    }
}

