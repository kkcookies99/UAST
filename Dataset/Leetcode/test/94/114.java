 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        res.addAll(XXX(root.left));
        res.add(root.val);
        res.addAll(XXX(root.right));
        return res;
    }
}

