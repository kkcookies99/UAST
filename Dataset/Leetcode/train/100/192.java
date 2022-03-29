 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        boolean isNode = false;
        if(p == null && q == null) return true;
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p != null && q != null) {
            if(p.val == q.val) {
                isNode = true;
            }
        }
        boolean isLeft = XXX(p.left, q.left);
        boolean isRight = XXX(p.right, q.right);
        return isLeft && isRight && isNode;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


