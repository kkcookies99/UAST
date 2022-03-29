 class Solution {
    public boolean XXX(TreeNode root) {
        if(root.left==null&&root.right==null) return true;
        if(root.left==null||root.right==null) return false;
        if(root.left.val==root.right.val){
          return find(root.left,root.right);
        }else{
            return false;
        }
    }
    public boolean find(TreeNode a ,TreeNode b){
        boolean flaga = false,flagb = false;
        if(a.left==null||b.right==null){
            if(a.left==null&&b.right==null){
               flaga = true; 
            }else{
                return false;
            }
        }
        if(a.right==null||b.left==null){
            if(a.right==null&&b.left==null){
                flagb = true;
            }else{
                return false;
            }
        }
        if(flaga==false&&a.left.val==b.right.val){
           flaga = find(a.left,b.right);
        }
        if(flagb==false&&a.right.val==b.left.val){
           flagb = find(a.right,b.left);
        }
        return flaga&&flagb;
    }
}

