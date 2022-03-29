 class Solution {
    /* 递归解法
    public boolean XXX(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        LNROrder(root,list);
        int len = list.size();
        if(len<2) return true;
        //判断中序序列是否为增序
        for(int i=1;i<list.size();i++){
            // 注意题目时严格大于或小于
            if(list.get(i-1)>=list.get(i)) return false;
        }
        return true;
    }
    public void LNROrder(TreeNode root,List<Integer> list){
        if(root==null) return ;
        LNROrder(root.left,list);
        list.add(root.val);
        LNROrder(root.right,list);
    }
    */
    //非递归解法--
    public boolean XXX(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        //表示上一个节点的实值
        double pre = -Double.MAX_VALUE;
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            //中序遍历中，判断当前元素的值是否大于上一个元素的值
            if(root.val<=pre) return false;
            pre = root.val;
            root = root.right;
        }
        return true;
    }
}

