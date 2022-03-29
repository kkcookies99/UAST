class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> oneLevel = new ArrayList<>();
            int count = queue.size();
            for(int i=0; i<count; i++){
                TreeNode node = queue.poll();
                oneLevel.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            res.add(oneLevel);
        }
        return res;
    }
}

