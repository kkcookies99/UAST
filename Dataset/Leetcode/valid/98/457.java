 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        TreeSet<Integer> set = new TreeSet<>();
        collectVal(root.left,set);
        if(set.size()==0 ||set.last()<root.val){
            set.clear();
            collectVal(root.right,set);
            if(set.size()==0 ||set.first()>root.val){
                set.clear();
                return XXX(root.left) && XXX(root.right);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    private void collectVal(TreeNode root,Set<Integer> set){
        if(root==null) return;
        set.add(root.val);
        collectVal(root.left,set);
        collectVal(root.right,set);
    }
}

