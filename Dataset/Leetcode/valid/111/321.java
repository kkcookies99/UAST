class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        return recur(root, 1);
    }
    //dfs递归
    private int recur(TreeNode node, int depth){
        if(node.left == null && node.right == null){
            return depth;
        }else{
            if(node.left != null && node.right != null)
                return 1 + Math.min(recur(node.left, depth), recur(node.right, depth));
            else if(node.left != null && node.right == null)
                return 1 + recur(node.left, depth);
            else if(node.right != null && node.left == null)
                return 1 + recur(node.right, depth);                
        }
        return 0;
    }

    //bfs：耗时击败99.82，内存击败94.62
    public int XXX(TreeNode root){
        if(root == null) return 0;
        Deque<TreeNode> qe = new LinkedList<>();
        qe.offer(root);
        int depth = 1;
        while(!qe.isEmpty()){
            int count = qe.size();
            while(count > 0){
                TreeNode p = qe.poll();
                if(p.left !=null) qe.offer(p.left);
                if(p.right !=null) qe.offer(p.right);
                if(p.left == null && p.right == null){
                    return depth;
                }
                count--;
            }
            depth++;
        }
        return 0;
    }
}

