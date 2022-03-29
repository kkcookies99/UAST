class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        int height = getHeight(root);
        for(int i = 0; i < height; i++) {
            List<Integer> child_result= new LinkedList<Integer>();
            result.add(child_result);
        }
        preOrder(root, 0, result);
        return result;
    }
    private int getHeight(TreeNode node) {
        if(node==null) return 0;
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }
    private void preOrder(TreeNode node, int i, List<List<Integer>> result) {
        if (node==null) return;
        result.get(i).add(node.val);
        preOrder(node.left, i+1, result);
        preOrder(node.right, i+1, result);
    }
}

