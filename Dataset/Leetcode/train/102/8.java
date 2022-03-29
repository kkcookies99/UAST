class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null) return res;
        LinkedList<TreeNode> next = new LinkedList();
        
        next.add(root);
        subXXX(next,res);
        return res;
    }
    public void subXXX(LinkedList<TreeNode> list,List<List<Integer>> result){
        if(list.size()==0) return;
        LinkedList<TreeNode> next = new LinkedList();
        LinkedList<Integer> res = new LinkedList();
        for(TreeNode node : list){
            res.add(node.val);
            if(node.left!=null) next.add(node.left);
            if(node.right!=null) next.add(node.right);
        }
        result.add(res);
        subXXX(next,result);
    }
}

