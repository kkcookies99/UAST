 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    public static void inOrder(TreeNode cur, List<Integer> result) {
        if (cur!=null) {
            inOrder(cur.left, result);
            result.add(cur.val);
            inOrder(cur.right, result);
        }
    }
}

