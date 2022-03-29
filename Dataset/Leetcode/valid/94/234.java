 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // inorder(list, root);
        iterationInorder(list, root);
        return list;
    }


    public void inorder(List<Integer> list, TreeNode root) {
        if(root != null) {
            inorder(list, root.left);
            list.add(root.val);
            inorder(list, root.right);
            
        }
    }

    public void iterationInorder(List<Integer> list, TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        // 指向当前处理的节点
        TreeNode cur = root;
        
        while(cur != null || !stack.isEmpty()) {
            // 当前不为空
            if(cur != null) {
                // 添加当前到栈中
                stack.addLast(cur);
                // 继续处理左子树
                cur = cur.left;
            } else {
                // 当前为空 
                // 说明 当前的父节点没有左子树
                // 此时 栈顶就是当前节点（null）的父节点
                cur = stack.removeLast();
                // 直接处理
                // 这样左 中 都处理完了
                list.add(cur.val);
                // 然后再处理父节点的右子树
                cur = cur.right;
            }
        }
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


