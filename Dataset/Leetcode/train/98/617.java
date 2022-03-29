 class Solution {
    public boolean XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        TreeNode preNode = null;
        while (temp != null || !stack.empty()) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                if (preNode != null && preNode.val >= temp.val)
                    return false;
                preNode = temp;
                temp = temp.right;
            }
        }
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


