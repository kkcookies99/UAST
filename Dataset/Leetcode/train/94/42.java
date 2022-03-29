 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        //根节点
        if(root.left == null && root.right == null){
            ret.add(root.val);
            return ret;
        }
        if(root.left != null) {
            ret.addAll(XXX(root.left));
        }
        ret.add(root.val);
        if(root.right != null){
            ret.addAll(XXX(root.right));
        }
        return ret;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


