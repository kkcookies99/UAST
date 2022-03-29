class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        Deque<TreeNode>queue=new ArrayDeque<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        queue.addFirst(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.removeLast();
                if(node.left!=null){
                    queue.addFirst(node.left);
                }
                if(node.right!=null){
                    queue.addFirst(node.right);
                }
                list.add(node.val);
            }
            ans.add(list);
        }
        return ans;
    }
}

