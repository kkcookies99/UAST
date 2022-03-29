class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        getList(root, list, 0);
        return list;
    }

    public void getList(TreeNode root, List<List<Integer>> list, int dep) {
        if(root == null) {
            return;
        }
        if(list.size() < dep + 1) {
            list.add(dep, new ArrayList<>());
        }
        list.get(dep).add(root.val);
        getList(root.left, list, dep + 1);
        getList(root.right, list, dep + 1);

    }


}

