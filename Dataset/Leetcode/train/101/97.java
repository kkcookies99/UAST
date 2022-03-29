 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        return cmp(root.left,root.right);
    }
    private boolean cmp(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null) return true;
        else if(node1==null||node2==null) return false;
        return node1.val==node2.val&&cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


