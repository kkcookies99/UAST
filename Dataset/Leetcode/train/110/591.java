class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root,0)!=-1;
    }
    private int dfs(TreeNode node,int level){
        if(node == null){
            return level;
        }
        int leftH = dfs(node.left,level+1);
        int rightH = dfs(node.right,level+1);
        if(leftH == -1||rightH == -1) return -1;
        int sub = leftH-rightH;
        if(sub>=-1&&sub<=1) return Math.max(leftH,rightH);
        else return -1;
    }
}

