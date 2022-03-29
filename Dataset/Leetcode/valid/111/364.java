class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        
       	while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i =0; i < size; i++){
            	TreeNode temp = queue.poll();
                if(temp.left == null){
                   	if(temp.right == null) 
                        return depth;
                    else
                        queue.offer(temp.right);
                }else if(temp.right == null){
                    queue.offer(temp.left);
                }else{
                    queue.offer(temp.left);
                    queue.offer(temp.right);
                }
            }
        }
        return depth;
    }
}

