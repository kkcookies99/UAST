class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        // 有一个队列来实现bfs
        Queue <TreeNode> queue = new ArrayDeque<TreeNode>();
        // root都没有 就啥也没了
        if(root == null) return results;
        // 把root放进队列
        queue.offer(root);
        int nodeNum = 1;
        while(!queue.isEmpty()){
            List<Integer> result = new ArrayList<Integer>();
            // count 用于记录这一层的节点有几个子节点
            int count = 0;
            for(int i=0;i<nodeNum;i++){
                // 将当前节点的值传入result
                TreeNode node = queue.poll();
                result.add(node.val);
                // 如果有左子节点,count++
                if(node.left != null){
                    count++;
                    queue.add(node.left);
                }
                // 如果有右子节点,count++
                if(node.right != null){
                    count++;
                    queue.add(node.right);
                }
            }
            // 把这层记录的子节点个数放到nodeNum用于指示下次遍历。
            nodeNum = count;
            // 把这一层的结果放到results中
            results.add(result);
        }
        return results;
    }
}

