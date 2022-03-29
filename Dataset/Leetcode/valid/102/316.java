class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root==null)
            return new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList();
            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            ans.add(new ArrayList(list));

        }
        return ans;
    }
}

