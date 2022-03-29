 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer>list=new ArrayList();
        mid(list,root);
        return list;
    }
    public void mid(List<Integer>list,TreeNode root){
        if(root!=null)
        {
            mid(list,root.left);
            list.add(root.val);
            mid(list,root.right);
        }
    }
}

