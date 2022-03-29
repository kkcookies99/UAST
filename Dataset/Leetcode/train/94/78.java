 class Solution {
    private List<Integer> ls=new ArrayList<Integer>();
    public void view(TreeNode root)
    {
        if(root!=null)
        {
            view(root.left);
            ls.add(root.val);
            view(root.right);
        }
    }
    public List<Integer> XXX(TreeNode root) {
        view(root);
        return ls;
    }
}

