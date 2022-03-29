 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null)return false;
        if(root.val==sum&&root.left==null&&root.right==null)return true;
        return XXX(root.left,sum-root.val)||XXX(root.right,sum-root.val);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


