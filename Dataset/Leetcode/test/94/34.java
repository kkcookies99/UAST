 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.addAll(XXX(root.left));
        list.add(root.val);
        list.addAll(XXX(root.right));
        return list;
    }
    
}

