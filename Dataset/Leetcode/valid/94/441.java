 class Solution {
    public List<Integer> XXX(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         if(root == null){
             return ans;
         }

         Deque<TreeNode> stack = new ArrayDeque<>();
         TreeNode p = root;
         while(p != null || !stack.isEmpty()){
            if(p != null){
                stack.push(p);
                p = p.left;
            }else{
                TreeNode node = stack.pop();
                ans.add(node.val);
                if(node.right != null){
                    p = node.right;
                }
            }
         }
         return ans;
    }
}

