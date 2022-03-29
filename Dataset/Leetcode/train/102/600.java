public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) 
        return res;
    // 层序遍历  主要是 两个变量  time // 每一次多少个  pre 这个去减
    int times = 0;
    int pre = 1;

    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        root = queue.poll();
        list.add(root.val);
        pre--;

        if (root.left != null){
            queue.add(root.left);
            times++;
        }
        if (root.right != null) {
            queue.add(root.right);
            times++;
        }
       
        if (pre == 0) {   // 这层完了  
            pre = times;
            times = 0;
            res.add(list);
            list = new ArrayList<>();
        } 
    }
    return res;

}

