class Solution {
    public int XXX(TreeNode root) {
        // 当为空则为0
        if(root == null) return 0;
        // 默认为1
        int level = 1;
        // 层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        if(root.left != null) queue.offer(root.left);
        if(root.right != null) queue.offer(root.right);
        while(!queue.isEmpty()){
            int num = queue.size();
            level ++; // 层序增加
            for(int i = 0; i < num; i ++){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null) return level; // 最近的叶子节点对应的高度
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return level;
    }
}

