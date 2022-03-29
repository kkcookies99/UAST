class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int index = 1;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();      
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left==null && node.right==null){
                    return index;
                }
                if (node.left !=null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }           
            index++;
        }      
        return index;
    }
}

