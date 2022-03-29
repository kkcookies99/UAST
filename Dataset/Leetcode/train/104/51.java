class Solution {
    public int XXX(TreeNode root) {
        // 迭代法 借助队列。看有几层
        Queue<TreeNode> que = new LinkedList<>();
        // 记录树的深度
        int depth = 0;
        if(root != null)
            que.offer(root);
        while(!que.isEmpty()){
            // 当前层队列大小
            int size = que.size();
            while(size-- > 0){
                // 弹出当前层中结点
                TreeNode node = que.poll();
                // 拉入下一层非空孩子结点
                if(node.left != null)
                    que.offer(node.left);
                if(node.right != null)
                    que.offer(node.right);
            }
            // 当前层中元素遍历完时。深度加1 一层只要做一次 放外面就行
            depth++;
        }
        return depth;
    }
}

/**
// 递归 
    public int XXX(TreeNode root) {
        // 递归出口 1.树为空时 2. 只有一个结点时
        if(root == null)
            return 0;
        if(root.left==null && root.right == null)
            return 1;
        // 否则树的最大深度即为 树的左右两个子树中最大的+树根1
        return Math.max(XXX(root.left),XXX(root.right))+1;
    }
 */

