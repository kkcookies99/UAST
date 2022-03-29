 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;
        TreeNode p = root;
        Queue<TreeNode> tmp = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        tmp.offer(root);
        while (!tmp.isEmpty()){
            TreeNode t = tmp.poll();
            list.add(t.val);
            if (t.left!=null){
                tmp.offer(t.left);
            }
            if (t.right!=null){
                tmp.offer(t.right);
            }
            if (t == p){
                res.add(new ArrayList<>(list));
                list.clear();
                p = ((LinkedList<TreeNode>) tmp).peekLast();
            }
        }
        return res;
    }
}

