 class Solution {
    int val=Integer.MIN_VALUE;
    boolean XXX=true;
    int i=0;//处理最小int值。
    public boolean XXX(TreeNode root) {
        walk(root);
        return XXX;
    }
    public void walk(TreeNode root)
    {
        if(root==null||!XXX) return;
        walk(root.left);
        if(i==0&&root.val>=val){ val=root.val;i++; }
        else if(root.val>val)val=root.val;
        else {XXX=false;return;}
        walk(root.right);
    }
}

