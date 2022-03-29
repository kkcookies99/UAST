 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        fun(root, list);
        return list;
    }

    public void fun(TreeNode node, List<Integer> list){
        if(node.left != null) fun(node.left, list);
        if(node == null) return;
        list.add(node.val);
        if(node.right != null) fun(node.right, list);
    }
}

