 public List<Integer> XXX(TreeNode root) {

    List<Integer> re = new ArrayList();
    return dfs(root,re);

}

public static List<Integer> dfs(TreeNode root,List<Integer> re){
    if(root==null)
        return re;
    dfs(root.left,re);
    re.add(root.val);
    dfs(root.right,re);
    return re;
}

