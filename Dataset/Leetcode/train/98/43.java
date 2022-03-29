 class Solution {
    List<Integer> res = new ArrayList<>();
    public boolean XXX(TreeNode root) {
        if(root==null)
            return true;
        inOrder(root);
        for(int i=1;i<res.size();i++){
            if(res.get(i)<=res.get(i-1)){
                return false;
            }
        }
        return true;
    }

    private void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            res.add(root.val);
            inOrder(root.right);
        }
    }
}

