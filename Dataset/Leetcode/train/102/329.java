public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    recursionTree(root,list,0);
    return list;
}
public void recursionTree(TreeNode root, List<List<Integer>> list,int height) {
    if (root == null) {
        return;
    }
    int nextHeight = height+1;
    if(list.size()<nextHeight){
        list.add(new ArrayList<>());
    }
    if (root.left!=null){
        recursionTree(root.left,list,nextHeight);
    }
    list.get(height).add(root.val);
    if (root.right!=null){
        recursionTree(root.right,list,nextHeight);
    }
}
