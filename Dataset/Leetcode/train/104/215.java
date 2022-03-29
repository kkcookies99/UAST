class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList();
        if(root==null){
            return 0;
        }
        queue.add(root);
        int res=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res++;
        }
        return res;
    }
}

