 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> res = new ArrayList();
        TreeNode node = root;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


