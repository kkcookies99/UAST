class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> result = new LinkedList<>();
        printOrder(result, root, 0);
        return result;
    }

    private void printOrder(List<List<Integer>> result, TreeNode node, int deep) {
        if(node == null) {
            return;
        }
        if(result.size() == deep) {
            result.add(new LinkedList<>());
        }
        result.get(deep).add(node.val);
        printOrder(result, node.left, deep+1);
        printOrder(result, node.right, deep+1);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


