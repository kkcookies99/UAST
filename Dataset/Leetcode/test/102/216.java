class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode now = queue.poll();
                level.add(now.val);
                if(now.left != null)
                    queue.offer(now.left);
                if(now.right != null)
                    queue.offer(now.right);
            }
            ans.add(level);
        }
        return ans;
    }
}

