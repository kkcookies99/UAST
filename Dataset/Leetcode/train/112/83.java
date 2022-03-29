class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null)return false;
        if(sum-root.val==0&&root.left==null&&root.right==null)return true;
        return (root.left!=null&&XXX(root.left,sum-root.val))
        ||((root.right!=null&&XXX(root.right,sum-root.val)));
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


