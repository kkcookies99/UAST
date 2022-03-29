public int XXX(TreeNode root) {
    if(root ==null) return 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int level = 0;
    while (!queue.isEmpty()){
        int s =queue.size();
        while (s>0){
            TreeNode treeNode = queue.poll();
            if(treeNode.left == null && treeNode.right ==null) {
                return level+=1;
            }
            if(treeNode.left !=null ){
                queue.offer(treeNode.left);
            }
            if(treeNode.right !=null ){
                queue.offer(treeNode.right);
            } 
            s--;
        }
        level++;
    }
    return level;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


