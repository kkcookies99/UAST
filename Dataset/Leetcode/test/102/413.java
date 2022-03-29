class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<Integer> list1=new ArrayList<Integer>();
        List<List<Integer>> list2=new ArrayList<List<Integer>>();
        if(root==null){
            return list2;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list1.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list2.add(new ArrayList<>(list1));
            list1.clear();
        }
        return list2;
    }
}

