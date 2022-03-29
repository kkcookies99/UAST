class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if(root==null) return ans;
        queue.add(root);
        bfs(ans,temp,queue);
        return ans;
    }
    public static void bfs(List<List<Integer>> ans,List<Integer> temp, Deque<TreeNode>  queue){
        int len = queue.size();
        if(len==0) return;
        for(int i = 0 ; i<len;i++){
            TreeNode node = queue.poll();
            temp.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        ans.add(new ArrayList<Integer>(temp));
        temp.clear();
        bfs(ans,temp,queue);
    }
}

