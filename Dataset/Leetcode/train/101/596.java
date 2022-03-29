 class Solution {
    public boolean XXX(TreeNode root) {
        if(null == root){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            if(p==null&&q==null){
                continue;
            }
            if(p==null||q==null||p.val!=q.val){
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);
            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }
}

