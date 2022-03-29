 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List list){
        if(null == root){
            return;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}

