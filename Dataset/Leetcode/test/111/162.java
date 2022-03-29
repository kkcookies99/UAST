class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return depth;
                }
                else{
                    if(node.left != null){queue.offer(node.left);}
                    if(node.right != null){queue.offer(node.right);}
                }
            }
            depth++;
        }
        return depth;
    }
}

