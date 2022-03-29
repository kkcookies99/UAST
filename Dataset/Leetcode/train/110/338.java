class Solution {
    public boolean XXX(TreeNode root) {
        return process(root).balanced;
    }

    private Info process(TreeNode cur) {
        if(cur == null) {
            return new Info(true,0);
        }
        Info lf = process(cur.left);
        Info rf = process(cur.right);

        int h = Math.max(lf.h,rf.h) + 1;
        boolean b = true;
        if(!lf.balanced || !rf.balanced || Math.abs(lf.h - rf.h) > 1) {
            b = false;
        }
        return new Info(b,h);
    }


    class Info {
        boolean balanced;
        int h;

        public Info(boolean b,int h){
            this.balanced = b;
            this.h = h;
        } 
    }
}

