 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        //特殊输入判断
        if (p == null || q == null) {
            if (p == null && q == null) {
                return true;
            } else {
                return false;
            }
        }
        //建立两个队列
        Queue<TreeNode> p_queue = new LinkedList<>();
        Queue<TreeNode> q_queue = new LinkedList<>();
        //两个队列必有根节点，进行添加。
        p_queue.offer(p);
        q_queue.offer(q);
        //从上到下，对树的每层进行逐层判断。
        while (!q_queue.isEmpty() || !p_queue.isEmpty()) {
            //确保两队列长度相同
            if (q_queue.size() != p_queue.size()) {
                return false;
            }
            //对每层进行逐节点对比
            int p_size = p_queue.size();
            for (int i = 0; i < p_size; i ++) {
                TreeNode p_tmp = p_queue.poll();
                TreeNode q_tmp = q_queue.poll();
                //先对比节点数值
                if (p_tmp.val != q_tmp.val) {
                    return false;
                } 
                //对比两者左孩子节点的有无是否一致
                if (p_tmp.left != null && q_tmp.left !=null) {
                    p_queue.offer(p_tmp.left);
                    q_queue.offer(q_tmp.left);
                } else if (p_tmp.left != null || q_tmp.left != null) {
                    return false;
                }
                ////对比两者右孩子节点的有无是否一致
                if (p_tmp.right != null && q_tmp.right !=null) {
                    p_queue.offer(p_tmp.right);
                    q_queue.offer(q_tmp.right);
                } else if (p_tmp.right != null || q_tmp.right != null) {
                    return false;
                }
            }
        }
        //经过全部队列判断皆无异常，true值返回。
        return true;
    }
}

