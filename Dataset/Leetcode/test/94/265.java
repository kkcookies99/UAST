 class Solution {
    public List<Integer> XXX(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        List<Integer> listLeft = XXX(root.left);
        list.addAll(listLeft);
        list.add(root.val);
        List<Integer> listRight = XXX(root.right);
        list.addAll(listRight);
        return list;
    }
}

