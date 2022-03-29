class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNode> q = new ArrayDeque<>();
        int size = 1;
        q.add(root);
        List<Integer> list_ = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            size--;
            list_.add(node.val);
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
            if(size == 0){
                list.add(list_);
                list_ = new ArrayList<>();
                size = q.size();
            }
        }
        return list;
    }
}

