class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int step=1;
        while(!queue.isEmpty()){
            int count=queue.size();
            for(int i=0;i<count;i++){
                TreeNode node=queue.poll();
                if(node.left==null&&node.right==null){
                    return step;
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                } 
            }
            step++;
        }
        return step;
    }
}

