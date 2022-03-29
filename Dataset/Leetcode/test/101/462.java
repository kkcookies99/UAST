 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        return XXX(root.left,root.right);
    }
    public boolean XXX(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1!=null  && root2==null) return false;

        return root1.val==root2.val && 
            XXX(root1.left,root2.right) && 
            XXX(root1.right,root2.left);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


