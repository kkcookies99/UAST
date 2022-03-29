    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        int num=1;
        if(root.left==null && root.right==null){
            return num;
        }else{
            return Math.max(getnum(root.left,num+1),getnum(root.right,num+1));
        }
    }

    private int getnum(TreeNode root,int num){
        if(root==null){
            return num;
        }
        if(root.left==null && root.right==null){
            return num;
        }else{
            return Math.max(getnum(root.left,num+1),getnum(root.right,num+1));
        }
    }

