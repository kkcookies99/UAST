class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int minHeight = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            minHeight++;
            for(int i = 0; i < len;i++){
                TreeNode temp = queue.poll();
                if(temp.left==null&&temp.right==null){
                    queue.clear();
                    break;
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }

        }
        return minHeight;
    }
}

