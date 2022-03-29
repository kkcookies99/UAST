class Solution {
    public int XXX(TreeNode root) {
        //dfs 
        if(root==null) return 0;  //最后一层的left,right;

        int left=XXX(root.left); //向左扎;
        int right=XXX(root.right);//向右扎：
        return Math.max(left,right)+1; //选出最大的每层+1;

    }
}

