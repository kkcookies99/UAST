 class Solution {
    List<Integer> arr =new ArrayList<>();
    public List<Integer> XXX(TreeNode root) {
        if(root==null) return arr;
        XXX(root.left);
        arr.add(root.val);
        XXX(root.right);
        return arr;
    }
}

