 class Solution {
    public boolean XXX(TreeNode root) {
        return XXXs(root,root);
    }
     public boolean XXXs(TreeNode r1,TreeNode r2) {
        if(r1==null && r2==null){
            return true;
        }
         if(r1==null || r2==null){
             return false;
         }
        return r1.val==r2.val && XXXs(r1.left,r2.right) && XXXs(r1.right,r2.left);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


