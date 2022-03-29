 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<Integer>que_val=new ArrayDeque<>();
        if(root==null){
            return false;
        }
        queue.add(root);
        que_val.add(root.val);
        while(!queue.isEmpty()){
             int size=queue.size();
             for(int i=0;i<size;i++){
                 TreeNode node=queue.poll();
                 int val=que_val.poll();
                 if(val==targetSum&&(node.left==null&&node.right==null))
                 return true;
                 if(node.left!=null){
                 queue.add(node.left);
                 que_val.add(val+node.left.val);
                 }
                 if(node.right!=null){
                 queue.add(node.right);
                 que_val.add(val+node.right.val);
                 }
            }
        }
        return false;
    }
}

