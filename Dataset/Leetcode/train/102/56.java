class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (true){
            List<Integer> dep = new ArrayList<>();
            Stack<TreeNode> child = new Stack<>();
            while (!stack.empty()){
                TreeNode node = stack.pop();
                dep.add(node.val);
                
                if (node.left != null){
                    child.add(node.left);
                }
                if (node.right != null){
                    child.add(node.right);
                }
            }
            if (dep.size() >0){
                list.add(dep);
            }
            if (child.size() >0){
                while (!child.empty()){
                    stack.add(child.pop());
                }
            }else{
                break;
            }

        }
        return list;
    }
}

