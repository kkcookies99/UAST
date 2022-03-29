class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        depthHelper(res, root, 0);
        return res;
    }

    private void depthHelper(List<List<Integer>> res, TreeNode root, int depth) {
        //terminator 
        if (root == null) return;

        //process
        if (depth == res.size()) {
            res.add(new ArrayList<Integer>());
        }
        res.get(depth).add(root.val);

        //drill down
        depthHelper(res, root.left, depth + 1);
        depthHelper(res, root.right, depth + 1);
        //restore current status
    }
}

