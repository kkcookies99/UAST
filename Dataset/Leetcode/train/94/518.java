 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> resList = new LinkedList<>();
        infixOrder(root, resList);
        return resList;
    }
    private void infixOrder(TreeNode node, List<Integer> resList) {
        if (node != null) {
            infixOrder(node.left, resList);
            resList.add(node.val);
            infixOrder(node.right, resList);
        }
    } 
}

