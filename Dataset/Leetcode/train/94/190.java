 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        if (root.left != null) {
           result.addAll(XXX(root.left));
        }
         result.add(root.val);
         if (root.right == null) {
             return result;
         }
         result.addAll(XXX(root.right));
         return result;
    }
}

