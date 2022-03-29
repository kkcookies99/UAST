 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<TreeNode> list=new ArrayList();
        List<Integer> res=new ArrayList();
        TreeNode p=root;
        while(p!=null||list.size()>0){
            while(p!=null){
                list.add(p);
                p=p.left;
            }
            p=list.remove(list.size()-1);
            res.add(p.val);
            p=p.right;
        }
        return res;
	}
}

