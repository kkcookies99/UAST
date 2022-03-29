 class Solution {
    public List<Integer> XXX(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root != null) {

			res.addAll(XXX(root.left));
			res.add(root.val);
			res.addAll(XXX(root.right));
		}
		return res;
    }    
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


