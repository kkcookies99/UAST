class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return 0;
        int nodeNum = 1;
        int depth = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            depth ++;
            int chileNum = 0;
            while(nodeNum > 0){
                TreeNode tempNode = queue.poll();
                if(tempNode.left == null && tempNode.right == null){
                    return depth;
                }
                if(tempNode.left != null){
                    queue.add(tempNode.left);
                    chileNum ++;
                }
                if(tempNode.right != null){
                    queue.add(tempNode.right);
                    chileNum ++;
                }
                nodeNum --;
            }
            nodeNum = chileNum;
        }
        return depth;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


