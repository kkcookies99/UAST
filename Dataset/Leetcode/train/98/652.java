 class Solution {
    private long last = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root == null)    return true;
        if(!XXX(root.left))    return false;
        if(last >= root.val)    return false;
        this.last = root.val;
        return XXX(root.right);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


