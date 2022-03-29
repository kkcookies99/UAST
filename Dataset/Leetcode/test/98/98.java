 class Solution {
    public boolean XXX(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        for (int i = 0; i < res.size()-1; i++) {
            if(res.get(i)>=res.get(i+1)){
                return false;
            }
        }
        return true;    
    }
    public void inorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}

