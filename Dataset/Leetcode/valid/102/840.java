     public List<List<Integer>> XXX(TreeNode root) {
        List<Integer> list = null;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> numList = new ArrayList<>();
        if(root == null){return result; }
       queue.offer(root);///进队
       while(!queue.isEmpty()){
           int size = queue.size();
           TreeNode treeNode = null;
           for (int i = 0; i < size; i++) {
               treeNode = queue.poll();
               numList.add(treeNode.val);
               if(treeNode.left != null){ queue.offer(treeNode.left); }
               if(treeNode.right != null){queue.offer(treeNode.right); }
           }
           //for循环结束每一次结束为一层
           list = new ArrayList();
           for (Integer num : numList) {list.add(num);}
           numList.clear();
           result.add(list);
       }
return result;
}

