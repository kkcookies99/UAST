class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int l=XXX(root.left);
        int r=XXX(root.right);
        if(l==0){
            l=Integer.MAX_VALUE;
        }
        if(r==0){
            r=Integer.MAX_VALUE;
        }  
        return 1+Math.min(l,r);
    }
}```

