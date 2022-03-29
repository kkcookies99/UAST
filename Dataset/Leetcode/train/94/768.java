 class Solution {
    public List<Integer> XXX(TreeNode root) {
        //前序遍历order(root,0,1,2)
        //中序遍历order(root,1,0,2
        //后序遍历order(root,2,0,1)
        return order(root,1,0,2);
    }
    public List<Integer> order(TreeNode root,int accStep,int leftStep,int rightStep){
        if(root == null) return Collections.emptyList();
        LinkedList<Object[]> stack = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        stack.push(new Object[]{root,0});
        while(stack.size() > 0){
            Object[] objects = stack.peek();
            TreeNode node = (TreeNode)objects[0];
            if ((Integer) objects[1]+1 > 2) {
                stack.pop();
            }
            if(objects[1].equals(accStep)){
                result.add(node.val);
            }
            if(objects[1].equals(leftStep) && node.left != null){
                stack.push(new Object[]{node.left,0});
            }
            if(objects[1].equals(rightStep) && node.right != null){
                stack.push(new Object[]{node.right,0});
            }
            objects[1] = (Integer)objects[1]+1;
        }
        return result;
  }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


