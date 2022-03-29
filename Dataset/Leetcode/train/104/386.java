class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        //使用队列存储，先进先出，层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //记录层数
        int count = 0;
        while(queue.size() > 0){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            count++;
        }
        return count;
    }
}

