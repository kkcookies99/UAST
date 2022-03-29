class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){return result;}
        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        myQueue.offer(root);

        while(!myQueue.isEmpty()){
            List<Integer> curResult = new ArrayList<Integer>();
            int curSize = myQueue.size();
            for(int i = 0; i < curSize; i++){
                TreeNode curNode = myQueue.poll();
                curResult.add(curNode.val);
                if(curNode.left != null){
                    myQueue.offer(curNode.left);
                }
                if(curNode.right != null){
                    myQueue.offer(curNode.right);
                }
            }
            result.add(curResult);
        }
        return result;
    }
}

