 class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> XXX(TreeNode root) {
        if(root.left != null){
            return XXX(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            return XXX(root.right);
        }
        return list;
    }
}

