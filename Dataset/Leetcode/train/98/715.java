  public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        if( root.right == null && root.left == null){
            return true;
        }
        return isValid(root, Long.MAX_VALUE,Long.MIN_VALUE);
    }

    public boolean isValid(TreeNode current, long max ,long min){
        if(current == null){
            return true;
        }
        if(current.val <= min || current.val >= max){
            return false;
        }
        return isValid(current.left, current.val,min) && isValid(current.right,max,current.val);
    }

