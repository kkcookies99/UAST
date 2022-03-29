class Solution {
    public boolean XXX(TreeNode root) {
        return process(root).XXX;
    }

    public static class Info{
        public boolean XXX;
        public int height;

        public Info(boolean i, int h){
            XXX=i;
            height=h;
        }
    }

    public static Info process(TreeNode head){
        if(head==null){
            return new Info(true,0);
        }

        Info leftInfo=process(head.left);
        Info rightInfo=process(head.right);
        int height = Math.max (leftInfo.height, rightInfo.height)+1;//第一次错这边没有+1，第二次加了就对了

        boolean XXX=true;
        if(!leftInfo.XXX){
            XXX = false;
        }
                
        if(!rightInfo.XXX){
            XXX = false;
        }

        if(Math.abs(leftInfo.height-rightInfo.height)>1){
            XXX = false;
        }

        return new Info(XXX,height);
    }
}

