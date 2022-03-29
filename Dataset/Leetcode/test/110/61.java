class Solution {
    private Map<TreeNode,Integer> map = new HashMap<>();
    public boolean XXX(TreeNode root) {
        maxDepth(root);
        return recursivelyCheck(root);        
    }
    //确定每个节点高度
    private int maxDepth(TreeNode root){
        if(root == null){
            map.put(root,0);
            return 0;
        }
        int depth = Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
        map.put(root,depth);
        return depth;            
    }
    //遍历每个节点是否符合要求
    private boolean recursivelyCheck(TreeNode root){
             if(root == null) return true;        
         return Math.abs(map.get(root.left)-map.get(root.right)) < 2  && recursivelyCheck(root.left) && recursivelyCheck(root.right);
    }
}

