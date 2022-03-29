class Solution {
    public int XXX(TreeNode root) {
        if(root==null){return 0;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);//入队
        int level = 0;
        while(!queue.isEmpty()){//每次判断，就会开始新的一层
            level++;//第几层
            int levelCount = queue.size();
            for(int i=0;i<levelCount;i++){//遍历每一层中具体的元素
                TreeNode node = queue.poll();//出队
                //如果当前node节点的左右子树都为空，直接返回level即可
                if(node.left==null && node.right==null){
                    return level;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return 0;
    }
}

