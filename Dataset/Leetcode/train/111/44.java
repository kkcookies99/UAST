class Solution {
    public int XXX(TreeNode root) {
        
        if(root==null)
            return 0;
        
        Queue<TreeNode>queue=new LinkedList<>();

        queue.add(root);

        int step=1;
        while (!queue.isEmpty()){
            int sz=queue.size();
            for(int i=0;i<sz;i++){
                TreeNode cur=queue.poll();//为什么要写在里面，和写在外面的区别是什么啊

                if(cur.left==null&&cur.right==null)
                    return step;

                if(cur.left!=null)
                    queue.add(cur.left);

                if(cur.right!=null)
                    queue.add(cur.right);

            }
            step++;
        }
        return step;
    }
}

