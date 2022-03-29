 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        List<List<Integer>> lists=new ArrayList<>();
        while(queue.size()!=0){
            int count=queue.size();
            List<Integer> list=new ArrayList<>();
            while(count>0){
                TreeNode treeNode=queue.peek();
                queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
                count--;
            }
            lists.add(list);
        }
        return lists;
    }
}

