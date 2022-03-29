 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursion(root, list);
        return list;
    }

    public void recursion(TreeNode root, List<Integer> list){
        while(root != null){
            if (root.left != null) recursion(root.left, list);
            list.add(root.val);
            if(root.right != null) recursion(root.right, list);
            break;
        }
    }
}

