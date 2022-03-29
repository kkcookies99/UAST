class Solution {
    public int XXX(TreeNode root) {
        if (null==root){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int count=1;
        while(!queue.isEmpty()){
            int i=queue.size();
            while (i>0) {
                TreeNode node = queue.poll();
                if (null==node.left&&null==node.right){
                    return count;
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                if (--i==0){
                    ++count;
                }
            }
        }
        return count;
    }
}

