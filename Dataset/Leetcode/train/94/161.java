 class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> XXX(TreeNode root) {
        if(root == null)
            return ans;
        XXX(root.left);
        ans.add(root.val);
        XXX(root.right);
        return ans;
    }
}

