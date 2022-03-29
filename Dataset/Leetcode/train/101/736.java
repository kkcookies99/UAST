 class Solution {
    public boolean XXX(TreeNode root) {
        return judge(root,root);
    }
    public boolean judge(TreeNode p, TreeNode q){
        if((p==null && q!=null)||(p!=null && q==null)){
            return false;
        }
        if(p==null && q==null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        return judge(p.left,q.right) && judge(p.right,q.left);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


