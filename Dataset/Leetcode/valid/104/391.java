class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        int height = 0;
        int levelSize = 1;
        if(root == null) return height;

         queue.offer(root);
         while(!queue.isEmpty()){
            TreeNode node =  queue.poll();
            levelSize--;
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
            if(levelSize == 0){
                height++;
                levelSize = queue.size();
            }
         }
         return height;
    }
}

