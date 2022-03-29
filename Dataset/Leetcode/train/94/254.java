 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> lists=new ArrayList<Integer>();
        backtrace(root,lists);
        return lists;
    }

    public void backtrace(TreeNode root,List<Integer> lists){
        if(root!=null){
            backtrace(root.left,lists);
            lists.add(root.val);
            backtrace(root.right,lists);
        }
    }
}

