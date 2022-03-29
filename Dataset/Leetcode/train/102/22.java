class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();              //记录当前层的节点数
            List<Integer> list=new ArrayList<>();
            while(len>0){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                len--;
            }
            res.add(list);
        }
        return res;
    }
}

