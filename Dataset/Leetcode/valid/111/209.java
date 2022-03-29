class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(root);
        int level = 0;
        while(!qu.isEmpty()){
            int k = qu.size();
            level++;
            while(k > 0){
                TreeNode tmp = qu.poll();
                if(tmp.left == null && tmp.right == null){
                    return level;
                }
                if(tmp.left != null)    qu.add(tmp.left);
                if(tmp.right!= null)    qu.add(tmp.right);
                k--;
            }
        }
        return -1;
    }
}

