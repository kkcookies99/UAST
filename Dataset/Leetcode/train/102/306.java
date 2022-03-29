 public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
        return res;
    }
    LinkedList<TreeNode> queue = new LinkedList<>();
    List<Integer> list =new ArrayList<>();
    queue.add(root);
    TreeNode curEndNode = root;
    TreeNode nextEndNode = null;
    while (!queue.isEmpty()){
        TreeNode remove = queue.remove();
        list.add(remove.val);
        if(remove.left != null){
            queue.add(remove.left);
            nextEndNode = remove.left;
        }
        if(remove.right != null){
            queue.add(remove.right);
            nextEndNode = remove.right;
        }
        if(remove == curEndNode){
            res.add(list);
            curEndNode = nextEndNode;
            list = new ArrayList<>();
        }
    }
    return res;
}
