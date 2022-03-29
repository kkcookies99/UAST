 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left == null && node.right == null){
                res.add(node.val);   //读取叶子结点的val
            }
            else{
                if(node.right != null){
                    stack.push(node.right);   //先压右节点
                    node.right = null;
                }
                stack.push(node);   //再把当前节点压进栈
                if(node.left != null){
                    stack.push(node.left);   //最后还是需要把左节点压进栈
                    node.left = null;
                }
            }
        }
        return res;
    }
}

