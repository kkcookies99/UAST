 class Solution {
    List<Integer> res=new ArrayList();
    public List<Integer> XXX(TreeNode root) {
        if(root!=null){
            recursion(root);
        }
        return res;
    }
    //递归，很简单
    public void recursion(TreeNode root){
        if(root.left!=null){
            recursion(root.left);
        }
        res.add(root.val);
        if(root.right!=null){
          recursion(root.right);
        }   
    }
    //迭代
    public List<Integer> iteration(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack=new Stack();
        TreeNode node = root;
        while (node != null || stack.size() != 0) {
            if (node != null) {
                stack.push(node);//压栈操作
                node = node.left;//优先向左
            } else {
                node = stack.pop();//出处理节点值
                results.add(node.val);//左方肯定已经处理完了，再向右
                node = node.right;
            }
        }
        return results;
    }
}

