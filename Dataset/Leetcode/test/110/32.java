class Solution {
    public boolean XXX(TreeNode root) {

        if (root == null) return true;
        return XXX(root.left) 
                && XXX(root.right) 
                && Math.abs(travelHeight(root.left) - travelHeight(root.right)) <= 1  ; 
    }


    /**
     * 获取node的高度
     *
     * @param node
     * @return
     */
    private int travelHeight(TreeNode node) {
        if (node == null) return 0;
        int left = travelHeight(node.left);
        int right = travelHeight(node.right);
        return Math.max(left, right) + 1;
    }

}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


