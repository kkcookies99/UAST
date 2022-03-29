 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> element = new ArrayList<>(10);
        inOrder(root,element);
        return element;
    }
    private void inOrder(TreeNode root,List<Integer> element){
        if(root == null){
            return;
        }
        inOrder(root.left,element);
        element.add(root.val);
        inOrder(root.right,element);
    }
}

