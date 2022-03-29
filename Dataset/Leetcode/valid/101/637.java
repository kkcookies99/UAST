 public boolean XXX(TreeNode root) {
        TreeNode root1=clone(root);
        reverse(root);
        return euqals(root,root1);
    }
    private TreeNode clone(TreeNode root){
        if(root==null)
            return null;
        TreeNode t=new TreeNode(root.val);
        t.left=clone(root.left);
        t.right=clone(root.right);
        return t;
    }
    private void reverse(TreeNode root){
        if(root==null)
            return;
        reverse(root.left);
        reverse(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    private boolean euqals(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)
            return true;
        if(t1!=null&&t2!=null){
            if(t1.val!=t2.val)
                return false;
            boolean left=euqals(t1.left,t2.left);
            boolean right=euqals(t1.right,t2.right);
            return left&&right;
        }
        return false;
    }

