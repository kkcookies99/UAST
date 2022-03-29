class Solution {
    public int XXX(TreeNode root) {
        //最初想法：1、用递归2、要用一个变量记录当前深度，最后返回这个变量
        //树的层序遍历也可以去求最小深度。以下是实现
        
        if(root == null){ return 0;}
       
        //树的层序遍历 可以求出最短深度
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        int depth = 1;
        while(!q.isEmpty()){
            int count = q.size();
            while(count > 0){
                TreeNode tem=q.poll();
                if(tem.left == null && tem.right == null){return depth;}
                if(tem.left != null){
                    q.offer(tem.left);
                }
                if(tem.right != null){
                    q.offer(tem.right);
                }
                count--;
            }
            depth++;
        }
        return depth;
    }
}

