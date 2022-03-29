 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        recursion(root, result);
        return result;
    }

    private void recursion(TreeNode root, List<Integer> result){
        if(root == null) {return;}
        recursion(root.left, result);
        result.add(root.val);
        recursion(root.right, result);
    }
}

