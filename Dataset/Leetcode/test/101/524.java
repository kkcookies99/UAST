 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        //根节点无影响 不放入其中
        queue.offer(root.left);
        queue.offer(root.right);
        do {
            TreeNode left=queue.poll();
            TreeNode right=queue.poll();
            if(left==null&&right==null)
            continue;
            else if(left==null||right==null||left.val!=right.val)
            return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }while(!queue.isEmpty());
        return true;
    }
}

