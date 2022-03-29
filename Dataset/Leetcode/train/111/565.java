class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            depth++;
            while(size-->0){
                TreeNode node = queue.poll();
                if(node.left==null && node.right==null){
                    return depth;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return -1;
    }
}

