class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> toollist = new ArrayList<>();
            int len = q.size();
            for(int i=0;i < len;i++){
                TreeNode tmp = q.poll();
                toollist.add(tmp.val);
                if(tmp.left != null){
                    q.add(tmp.left);
                }
                if(tmp.right != null){
                    q.add(tmp.right);
                }
            }
            res.add(toollist);
        }
        return res;
    }
}

