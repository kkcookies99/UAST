 public boolean XXX(TreeNode p, TreeNode q) {

    if(p==null&&q==null){
        return true;
    }
    if(p==null||q==null){
        return false;
    }
    if(p.val==q.val){
       return XXX(q.left,p.left)&&XXX(q.right,p.right);
        
    }else{
         return false;
    }

}
