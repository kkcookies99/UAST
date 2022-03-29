public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    XXX(root, 0, list);
    return list;
}
public static void XXX(TreeNode root, int depth, List<List<Integer>> list) {
    if (root == null){
        return;
    }
    if (depth >= list.size()){
        list.add(new ArrayList<Integer>());
    }
    list.get(depth).add(root.val);  // 层序(放置顺序没有关系)
    XXX(root.left, depth + 1, list);
    XXX(root.right, depth + 1, list);
}

