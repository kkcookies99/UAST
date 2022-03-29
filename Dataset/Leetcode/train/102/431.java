class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        //层次遍历使用的就是bfs 每一层每一层的遍历 然后存放到集合当中
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList();
        if(root==null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            //这一层
            int size=queue.size();
            List<Integer> curList=new ArrayList<Integer>();
            while(size>0){
                TreeNode node=queue.poll();
                //对当前节点的操作
                curList.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                size--;
            }
            result.add(curList);
        }
        return result;
    }
}

