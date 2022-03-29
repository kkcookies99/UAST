class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> res_=new ArrayList<Integer>();
            for(int i=que.size();i>0;i--){
                TreeNode tmp=que.poll();
                res_.add(tmp.val);
                if(tmp.left!=null) que.offer(tmp.left);
                if(tmp.right!=null) que.offer(tmp.right);
            }
            res.add(res_);
        }
        return res;
    }
}

