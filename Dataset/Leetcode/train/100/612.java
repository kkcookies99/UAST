 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        boolean a = XXX(p.left,q.left);
        boolean b = XXX(p.right,q.right);
        return a && b && p.val == q.val;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


