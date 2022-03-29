class Solution {
    public int XXX(TreeNode root) {
       int XXX = 0;
       if(root == null){
           return XXX;
       }
       Queue<TreeNode> queue  = new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
           int size =queue.size();
           XXX++ ; 
           for(int i = 0; i < size; i++){
               TreeNode node = queue.poll();
               //核心，是叶子节点，直接返回值。
               if(node.left == null && node.right == null){
                  return XXX;
               }
      
               if(node.left != null){
                   queue.offer(node.left);
               }
               if(node.right != null){
                   queue.offer(node.right);
               }
           }
       }
       return XXX;
    }
}

