public List<List<Integer>> XXX(TreeNode root) {
       if (root==null) {
            return new ArrayList<>();
        }
     //两个栈循环倒换
        ArrayDeque<TreeNode> queue1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> queue2 = new ArrayDeque<>();

        List<List<Integer>> lists = new ArrayList<>();
       List<Integer> list = new ArrayList<>();

        queue1.add(root);
        list.add(root.val);
        lists.add(list);
        int n=0;
        //控制循环次数
        while(n<getMaxDepth(root)){
            //第一个栈
            while(!queue1.isEmpty()){
                TreeNode node = queue1.poll();
                if (node.left!=null) {
                    queue2.add(node.left);
                }
                if (node.right!=null) {
                    queue2.add(node.right);
                }

            }
            //第二个栈
            ArrayList<Integer> listF = new ArrayList<>();
            while(!queue2.isEmpty()){
                TreeNode poll = queue2.poll();
                listF.add(poll.val);//在第二个栈中统计所有元素

                queue1.add(poll);//加到第一个栈中再循环
            }
            if(queue2.isEmpty()){
                    if (listF.isEmpty()) {//去掉最后一次的空集合
                    return  lists;
                }
                lists.add(listF);//第二个栈空了 一层完了
                n++;

            }
        }
        return  lists;
    }

    //求树的最大深度 用于控制循环
    public int getMaxDepth(TreeNode root){

        if (root==null) {
            return 0;
        }
    return Math.max(getMaxDepth(root.left),getMaxDepth(root.right))+1;
    }

