 class Solution {
    public boolean XXX(TreeNode root) {
        return getHalf(root, root);
    }

    public boolean getHalf(TreeNode p, TreeNode q){
        if(p != null && q != null && p.val == q.val){
            return getHalf(p.left, q.right) && getHalf(p.right, q.left);
        }
        return p == null && q == null;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


