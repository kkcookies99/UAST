class Solution {
    public int XXX(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int n){
        if(root==null){
            return n;
        }
        n+=1;//当前节点有效
        int a=dfs(root.left,n);//递归左子树
        int b=dfs(root.right,n);//递归右子树
        n=n>a?n:a;
        n=n>b?n:b;
        return n;//找出最大的结果并返回
    }
}

