 class Solution {
    public List<Integer> XXX(TreeNode root) {
        ccc(root);
        return res;
    }
    List<Integer> res = new ArrayList<>();
    private void ccc(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left!=null) {
            ccc(root.left);
        }
        res.add(root.val);
        if (root.right!=null) {
            ccc(root.right);
        }
    }
}

