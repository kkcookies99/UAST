class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        Queue <TreeNode> queue = new <TreeNode> LinkedList();
        queue.offer(root);
        int depth = 1;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0;i<len;++i){
                TreeNode temp =queue.poll();
                if(temp.left == null && temp.right == null) return depth;
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            ++depth;
        }
        return depth;
    }
}

