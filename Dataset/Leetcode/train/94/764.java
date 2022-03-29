 class Solution {
    public List<Integer> XXX(TreeNode root) {
        return inOrder(root,new ArrayList());
    }

    public List inOrder(TreeNode node, List list){
        if(node == null) {
            return list;
        }

        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);

        return list;
    }
}

