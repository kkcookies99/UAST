class Solution {
    public int XXX(TreeNode root) {
        //BFS
        if(root == null) return 0;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = 1,len = 1;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int flag = 0;
            size--;
            if(node.left != null) q.add(node.left);
            else flag++;
            if(node.right != null) q.add(node.right);
            else flag++;
            if(flag == 2) return len;
            if(size == 0){
                len++;
                size = q.size();
            }
        }
        return 0;
    }
}

