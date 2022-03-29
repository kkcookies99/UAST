 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return inorderTraversal(p,q);
    }

    public boolean inorderTraversal(TreeNode p,TreeNode q) {
        if (p == null && q == null){
            return true;
        } else if ((p == null && q != null) || (p != null && q ==null)){
            return false;
        } else if ((p.left != null && q.left ==null) || (p.left == null && q.left !=null)){
            return false;
        } else if ((p.right == null && q.right !=null) || (p.right != null && q.right ==null)){
            return false;
        }else{
            if (p.left != null && q.left != null){
                boolean result =  inorderTraversal(p.left,q.left);
                if ((p.val != q.val) || !result){
                    return false;
                }
                return inorderTraversal(p.right,q.right);
            } else {
                if (p.val != q.val){
                    return false;
                }
                return inorderTraversal(p.right,q.right);
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


