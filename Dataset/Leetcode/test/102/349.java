class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        if(root == null) return res;
        
        while(!queue.isEmpty()){
            TreeNode point;
            Queue<TreeNode> tmpQueue = new LinkedList<>();
            List<Integer> tmp = new LinkedList<>();
            while(!queue.isEmpty()){
                point = queue.poll();
                tmp.add(point.val);
                if(point.left != null){
                    tmpQueue.add(point.left);
                }
                if(point.right != null){
                    tmpQueue.add(point.right);
                }
            }
            res.add(new LinkedList<>(tmp));
            queue = new LinkedList<>(tmpQueue);
        }

        return res;
    }
}

