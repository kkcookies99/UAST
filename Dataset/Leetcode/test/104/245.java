class Solution {
    public int XXX(TreeNode root) {
        int deepth = 0;
        if(root == null){
            return deepth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            deepth++;
        } 
        return deepth;    
    }      
}

