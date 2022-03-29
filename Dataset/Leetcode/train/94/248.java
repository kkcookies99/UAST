 class Solution {
    public List<Integer> XXX(TreeNode root) {      
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        res.addAll(XXX(root.left));
        res.add(root.val);
        res.addAll(XXX(root.right));
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


