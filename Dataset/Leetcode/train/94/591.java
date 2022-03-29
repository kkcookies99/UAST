 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        fun(result,root);
        return result;
    
    }
    public void fun(List<Integer> list,TreeNode root) {
        if (root != null) {
            fun(list,root.left);
            list.add(root.val);
            fun(list,root.right);
        }
    }
}

