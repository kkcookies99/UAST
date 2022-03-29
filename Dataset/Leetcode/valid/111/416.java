class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int step = 1;

        while(!queue.isEmpty()){
            for(int i=queue.size();i>0;i--){
                TreeNode curr = queue.poll();
                if (curr.left == null && curr.right == null) 
                    return step;
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            step++;
        }

        return step;
    }
}

