class Solution {
    public int XXX(TreeNode root) {
        if(root==null){ return 0; }
        Queue<Pair<TreeNode,Integer>> queue=new LinkedList<>();
        queue.offer(new Pair<>(root,1));
        while(!queue.isEmpty()){
            Pair<TreeNode,Integer> pair=queue.poll();
            TreeNode node=pair.getKey();
            if(node.left==null && node.right==null){
                return pair.getValue();
            }
            if(node.left!=null){
                queue.offer(new Pair<>(node.left,pair.getValue()+1));
            }
            if(node.right!=null){
                queue.offer(new Pair<>(node.right,pair.getValue()+1));
            }
        }
        return 1;
    }
}

