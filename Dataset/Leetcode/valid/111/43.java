class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
   
        int step = 0;//这里和最大深度写法保持统一
        while(!queue.isEmpty()){
            int sz = queue.size();
            step++;
            for(int i = 0;i<sz;i++){
                TreeNode cur = queue.poll();//这个要写在for里面
                if(cur.left == null &&cur.right == null){
                    return step;
                }
                if(cur.left != null){
                    queue.add(cur.left);
                }
                
                if(cur.right != null){
                    queue.add(cur.right);
                } 
            }
            //如果step++写在这里，那么上面的step初始化为1；
        }
        return step;//这个要写，for里面也要写
    }
}

