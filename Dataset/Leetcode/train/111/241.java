class Solution {
    public int XXX(TreeNode root) {
        int minDep = 0;
        boolean find = false;
        if(root == null){return minDep;}
        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        myQueue.offer(root);
        minDep++;
        while(!myQueue.isEmpty() && !find){
            int curSize = myQueue.size();
            for(int i = 0; i < curSize; i++){
                TreeNode curNode = myQueue.poll();
                if(curNode.left == null && curNode.right == null){
                    find = true;
                    break;
                }
                if(curNode.left != null){
                    myQueue.offer(curNode.left);
                }
                if(curNode.right != null){
                    myQueue.offer(curNode.right);
                }
            }
            if(!find){
                minDep++;
            }
        }
        return minDep;
    }
}

