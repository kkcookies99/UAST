 class Solution {
    private  List<Integer> list=new ArrayList<>();
    public List<Integer> XXX(TreeNode root) {

        return tree(root);
    }

    public List<Integer> tree(TreeNode root){

        if(root==null) return list;
        tree(root.left);
        list.add(root.val);
        tree(root.right);
        return list;
    }
}

