class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode removed = queue.remove(0);
                list.add(removed.val);
                if (removed.left != null)
                    queue.add(removed.left);
                if (removed.right != null)
                    queue.add(removed.right);
            }

            res.add(list);
        }
        return res;
    }
}

