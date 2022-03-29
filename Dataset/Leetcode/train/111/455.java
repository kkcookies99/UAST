class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0;i < n;i++){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return level;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            level += 1;
        }
        return level;
    }
}

