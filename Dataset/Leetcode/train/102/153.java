class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        //定义结果集合list，存放结果集
        List<List<Integer>> res_list = new ArrayList<>();
        if (root == null) {
            return res_list;
        }
        //定义队列，核心用法点
        Queue<TreeNode> que = new LinkedList();

        //第一步，顶点root进入队列
        que.add(root);

        //开始循环，层序 变量一遍，遍历完即que 为空
        while (!que.isEmpty()) {
            //因为返回结果集会List<List>，所以每次循环即每层的遍历
            //定义每次遍历的临时list——start
            List<Integer> list = new ArrayList<>();
            //内层循环次数 num 为开始是que中的个数，num个树出队列，下层循环num进入队列
            int num = que.size();
            for (int i = 0; i < num; i++) {
                TreeNode tmp = que.poll();
                list.add(tmp.val);
                if (tmp.left != null) {
                    que.offer(tmp.left);
                }
                if (tmp.right != null) {
                    que.offer(tmp.right);
                }
            }
            res_list.add(list);
            //临时list添加到结果集res_list——end
        }
        return res_list;
    }
}

