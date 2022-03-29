 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(p);
        q2.offer(q);
        while(!q1.isEmpty()&&!q2.isEmpty()){
            TreeNode a = q1.poll();
            TreeNode b = q2.poll();
            if(a.val!=b.val)return false;
            if(a.left!=null&&b.left==null)return false;
            if(a.left==null&&b.left!=null)return false;
            if(a.right!=null&&b.right==null)return false;
            if(a.right==null&&b.right!=null)return false;
            if(a.left!=null)q1.offer(a.left);
            if(a.right!=null)q1.offer(a.right);
            if(b.left!=null)q2.offer(b.left);
            if(b.right!=null)q2.offer(b.right);
        }
        return q1.isEmpty()&&q2.isEmpty();
    }
}

