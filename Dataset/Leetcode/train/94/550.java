 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dp(list,root);
        return list;
    }

    private void dp(List<Integer> list,TreeNode root){
        if(root == null)
            return;
        
        dp(list,root.left);
        list.add(root.val);
        dp(list,root.right);
    }
}

