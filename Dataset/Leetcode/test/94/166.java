 public List<Integer> XXX(TreeNode root) {
       List<Integer> res = new ArrayList<>();
        //先找到第一个节点，最左的
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode t = root;
        //如果栈为空，那说明已经全部遍历了
        while(t != null || !stack.isEmpty()){
            //寻找最左叶子
            while(t != null){
                stack.push(t);
                t = t.left;
            }
            if(!stack.isEmpty()){
                t = stack.pop();    //跳转回去父亲节点
                res.add(t.val);
                t = t.right;
            }
        }
        return res;
    }

