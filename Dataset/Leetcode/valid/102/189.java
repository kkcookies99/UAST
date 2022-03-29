class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
    
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            while(size>0){
                TreeNode apple = queue.poll();
                level.add(apple.val);
                if(apple.left != null){
                    queue.offer(apple.left);
                }
                if(apple.right != null){
                    queue.offer(apple.right);
                }
                size--;
            }
            ans.add(level);
        }
        return ans;
    }
}

