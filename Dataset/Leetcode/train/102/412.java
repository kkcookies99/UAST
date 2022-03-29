class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        // if(root == null ) return null;  不能在这里判断，不然返回值类型不一样
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;
        //创建一个队列 存放树的节点
        Deque<TreeNode> queue = new LinkedList<>();
        //先入队根节点
        queue.add(root);
        //队列为空是循环终止条件
        while(!queue.isEmpty()){
            //在内部创建一个临时list，用以存放每一层的节点的值，
            List<Integer> temp = new LinkedList<>();
            //这个size很关键，每次求得的是队列中那一层的节点的个数
            int size = queue.size();
            //新建一个树节点，用于循环获取队列中节点值 并 输出到temp
            TreeNode node = new TreeNode();
            for(int i = 0; i < size; i++){
                node = queue.poll();
                temp.add(node.val);
                //每次出队一个树节点的时候 都要判断一下这个节点是否有左节点和右节点，有的话就加入队列
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            //一层的树节点出队结束，把所有的temp值放进list。
            list.add(temp);
        }
        return list;
    }
}

