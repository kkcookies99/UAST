 public boolean XXX(TreeNode p, TreeNode q) {
    try{        
    if(p == q && p == null) return true;
    if(p.val == q.val && XXX(p.left,q.left) && XXX(p.right,q.right)) return true;
    return false;
    }catch(Exception e ){
        return false;
    }
}
