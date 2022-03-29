 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null || (root.left==null && root.right==null))return true;
        if(root.left==null || root.right==null)return false;
        if(root.left.val != root.right.val) return false;

        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root.left);
        level.offer(root.right);
        while(!level.isEmpty()){
            TreeNode p = level.poll();
            TreeNode q = level.poll();
            if(p==null && q == null)continue;
            if(p==null || q== null)return false;
            if(p.val != q.val)return false;

            level.offer(p.left);
            level.offer(q.right);

            level.offer(p.right);
            level.offer(q.left);
        }
        return true;
    }
}

