class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null)return res;
        helper(res,root,0);
        return res;
    }
    private void helper(List<List<Integer>> res,TreeNode root,int depth){
        if(root==null) return;
        if(res.size()<depth+1){
            res.add(new ArrayList());
        }
        res.get(depth).add(root.val);
        helper(res,root.left,depth+1);
        helper(res,root.right,depth+1);    
    }
}

