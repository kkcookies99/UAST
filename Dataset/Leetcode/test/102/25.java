class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size;
        TreeNode tmp;
        while(!q.isEmpty()) {
            size = q.size();
            List<Integer> list = new ArrayList<>(size);
            while(size > 0) {
                tmp = q.poll();
                list.add(tmp.val);
                if(tmp.left != null) {
                    q.offer(tmp.left);
                }
                if(tmp.right != null) {
                    q.offer(tmp.right);
                }
                size--;
            }
            ans.add(list);
        }
        return ans;
    }
}

