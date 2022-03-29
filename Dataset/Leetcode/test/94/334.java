 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Tree(list,root);
        return list;
    }
    public void Tree(List<Integer> list,TreeNode root){
        if(root.left!=null){
            Tree(list,root.left);
        }
        list.add(root.val);
        if(root.right!=null){
            Tree(list,root.right);
        }
    }
}

