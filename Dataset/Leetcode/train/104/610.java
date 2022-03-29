 class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null)
            queue.offer(root);
        int start = 0, end = 1, layer = 0;
        while(!queue.isEmpty()){
            root = queue.poll();
            start++;
            if(root.left!=null)
                queue.offer(root.left);
            if(root.right!=null)
                queue.offer(root.right);
            if(start==end){
                start = 0;
                end = queue.size();
                layer++;
            }
        }
        return layer;
    }
}

