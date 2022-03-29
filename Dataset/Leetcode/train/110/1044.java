 class Solution {
    public boolean XXX(TreeNode root) {
        return heightOf(root) != null;
    }
    
    private Integer heightOf(TreeNode node) {
        if (node == null) return 0;
        Integer left = heightOf(node.left);
        Integer right = heightOf(node.right);
        return left == null || right == null || Math.abs(left - right) > 1 ? null : 1 + Math.max(left, right);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


