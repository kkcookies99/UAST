class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int sum=0;
        while(!q.isEmpty()){
            int sz=q.size();
            sum++;
            for(int i=0;i<sz;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
        }
        return sum;
    }
}

