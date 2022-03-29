class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int step = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i=0;i<sz;i++){
                TreeNode tmp = q.poll();
                if(tmp.left!=null){
                    q.offer(tmp.left);
                }
                if(tmp.right!=null){
                    q.offer(tmp.right);
                }
            }
            step++;
        }
        return step;
    }
}

