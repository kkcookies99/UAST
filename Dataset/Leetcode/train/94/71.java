 class Solution {
    private static  List<Integer> list=new ArrayList();
    public List<Integer> XXX(TreeNode root) {
        if(root!=null){
            XXX(root.left);
            list.add(root.val);
            XXX(root.right);
        }
        return list;
    }
}

