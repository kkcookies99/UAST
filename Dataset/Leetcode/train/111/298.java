class Solution {
    public int XXX(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        Deque<TreeNode> nodeDeque = new LinkedList<>();  
        TreeNode currentNode = root;
        nodeDeque.addLast(currentNode);
        int depth = 0;
        
        int size;
        while (!nodeDeque.isEmpty()){
            size = nodeDeque.size();
            depth++;    
            for(int i = 0; i < size; i++) {
                currentNode = nodeDeque.removeFirst();
                
                if(currentNode.left == null && currentNode.right == null){
                    return depth;
                }
                
                if (currentNode.left != null) {
                    nodeDeque.addLast(currentNode.left);
                }

                if (currentNode.right != null) {
                    nodeDeque.addLast(currentNode.right);
                }
            }
        }
        
        return depth;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


