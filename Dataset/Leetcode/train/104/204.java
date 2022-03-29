class Solution {
    public int XXX(TreeNode root) {
        return dfs(root,0,0);
    }
    public static int dfs(TreeNode root,int len,int max)
    {
            if(root==null)
            {
                if(len>max)
                max=len;
                return max;
            }
            else 
            {
                int tmp=len;
                len++;
                int max1=dfs(root.left,len,max);
                int max2=dfs(root.right,len,max);
                len=tmp;
                return max1>max2?max1:max2;
            }
    }
}

