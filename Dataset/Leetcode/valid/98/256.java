 class Solution {
    List<Integer> list = new ArrayList<>();
    public void deal(TreeNode root){
        if(root==null) return;
        deal(root.left);
        list.add(root.val);
        deal(root.right);
    }
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        deal(root);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)) return false;
        }
        return true;
    }
}

