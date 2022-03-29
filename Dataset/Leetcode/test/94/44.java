 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        if (root.left != null){
            result.addAll(XXX(root.left));
            result.add(root.val);
            result.addAll(XXX(root.right));
        } else {
            result.add(root.val);
            result.addAll(XXX(root.right));
        }
         return result;
    }
}

