class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        //迭代，层次遍历
        //马上想到队列,每往下一层，都是左右试探
        //每次循环，都是遍历一层
        //结束的条件是全都到了叶节点，那么队列就为空了
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            result.add(level);
        }
        
        return result;
    }
}

