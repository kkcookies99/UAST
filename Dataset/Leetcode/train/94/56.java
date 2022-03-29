 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        index(root,res);
        return res;
    }
    public void index(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        index(root.left,res);
        res.add(root.val);
        index(root.right,res);
    }
}

