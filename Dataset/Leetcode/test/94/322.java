 class Solution {
    public List<Integer> XXX(TreeNode root) {
        // root为空的情况
        if(root==null) return new ArrayList<Integer>();
        // root无子树的情况
        if(root.left==null&&root.right==null){
            List<Integer> wholeList = new ArrayList<Integer>();
            wholeList.add(root.val);
            return wholeList;
        }

        // root有子树的情况，递归
        List<Integer> leftList = XXX(root.left);
        List<Integer> rightList = XXX(root.right);
        List<Integer> wholeList = new ArrayList<Integer>();
        wholeList.addAll(leftList);
        wholeList.add(root.val);
        wholeList.addAll(rightList);
        return wholeList;
    }
}

