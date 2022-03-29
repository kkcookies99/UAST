class Solution {
    List<List<Integer>> res = new ArrayList();
    List<Integer> list = new ArrayList();
    List<TreeNode> list1 = new ArrayList();
    List<TreeNode> list2 = new ArrayList();
    public List<List<Integer>> XXX(TreeNode root) {
        if(root==null){
            return res;
        }
        list1.add(root);
        while(list1.size()!=0){
            for(TreeNode node : list1){
                list.add(node.val);
                if(node.left!=null) list2.add(node.left);
                if(node.right!=null) list2.add(node.right);
            }
            res.add(new ArrayList(list));
            list1 = new ArrayList(list2);
            list.clear();
            list2.clear();
        }
        return res;
    }
}