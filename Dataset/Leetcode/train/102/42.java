class Solution {
    List<List<Integer>> nodePool = new ArrayList<>();
    public List<List<Integer>> XXX(TreeNode root) {
        if(root == null) return nodePool;
        traverse(root, 0);
        return nodePool;
    }
    private void traverse(TreeNode root, int level){
        if(root == null) return;
        if(nodePool.size()-1 < level ) nodePool.add(new ArrayList<Integer>());
        nodePool.get(level).add(root.val);
        traverse(root.left, level+1);
        traverse(root.right, level+1);
    }
}

