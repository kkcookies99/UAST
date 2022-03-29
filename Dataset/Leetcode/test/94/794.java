 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        // null or leaf
        if (root == null) {
            return result;
        }

        // Divide
        List<Integer> left = XXX(root.left);
        List<Integer> right = XXX(root.right);

        // Conquer
        result.addAll(left);
        result.add(root.val);
        result.addAll(right);
        return result;
    }
}

