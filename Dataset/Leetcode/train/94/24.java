 class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> XXX(TreeNode root) {
        if(root==null){
            return res;
        }
        XXX(root.left);
        res.add(root.val);
        XXX(root.right);
        return res;
    }
}

