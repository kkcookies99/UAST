class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(root == null) return res;
        Queue<TreeNode> seq = new LinkedList<TreeNode>();
        seq.offer(root);

        while(!seq.isEmpty()) {
            int len = seq.size();
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0; i < len; i++) {
                TreeNode node = seq.poll();
                tmp.add(node.val);
                if(node.left != null) seq.offer(node.left);
                if(node.right != null) seq.offer(node.right);
            }
            res.add(tmp);
        }

        return res;
    }
}

