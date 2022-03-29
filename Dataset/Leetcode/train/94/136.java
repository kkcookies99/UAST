 class Solution {
    List<Integer> list = new ArrayList();
    public List<Integer> XXX(TreeNode root) {
        if(root == null){
            return list;
        }
        XXX(root.left);
        list.add(root.val);
        XXX(root.right);
        return list;
    }
}