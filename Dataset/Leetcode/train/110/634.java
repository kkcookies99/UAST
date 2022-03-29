 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1)
            return false;
        return XXX(root.left)&&XXX(root.right);
    }
    private int getHeight(TreeNode node){
        if(node==null)
            return 0;
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


