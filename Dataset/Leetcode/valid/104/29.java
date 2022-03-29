class Solution {
    public int XXX(TreeNode root) {

        return XXX(0,root);
    }

    public int XXX(int c, TreeNode t){
        if(t==null){
            return c;
        }else{
            c++;
        }
        int left = XXX(c,t.left);
        int right = XXX(c,t.right);

        return Math.max(left,right);
    }
}

