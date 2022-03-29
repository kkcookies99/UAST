 class Solution {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> XXX(TreeNode root) {
        dfs(root);
        return res;
    }
    private void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        res.add(node.val);
        dfs(node.right);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


