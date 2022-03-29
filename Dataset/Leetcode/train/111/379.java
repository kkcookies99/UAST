class Solution {
    public int XXX(TreeNode root) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        int result = 0;
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            result++;
            int size = treeNodes.size();
            while (size > 0) {
                TreeNode top = treeNodes.pollFirst();
                temp.add(top.val);
                if (top.left != null) {
                    treeNodes.add(top.left);
                }
                if (top.right != null) {
                    treeNodes.add(top.right);
                }
                if (top.left == null && top.right == null){
                    return result;
                }
                size--;
            }
        }
        return result;
    }
}```

