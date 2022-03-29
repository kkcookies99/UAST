 public boolean XXX(TreeNode root, int targetSum) {
        return check(root,targetSum,0);
    }
    public boolean check(TreeNode root,int tar,int cur){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            cur+=root.val;
            if(cur==tar) return true;
        }
        return check(root.left,tar,cur+root.val)||check(root.right,tar,cur+root.val);
    }

