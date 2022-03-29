public int XXX(TreeNode root) {
    int ret=0;
    if(root==null){
        return 0;
    }
    else{
        if(root.left==null&&root.right==null){
            return 1;
        }
        else{
            ret++;
            int l=XXX(root.left)+ret;
            int r=XXX(root.right)+ret; 
            return l>r?l:r;   
        }
        
    }

}

