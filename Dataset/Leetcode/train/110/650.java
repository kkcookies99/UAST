 class Solution {
    public boolean XXX(TreeNode root) {
		if(root == null){
			return true;
		}
		int k = Math.abs(getd(root.left) - getd(root.right));
		if(k <= 1 && XXX(root.left) && XXX(root.right)){
			return true;
		}
        else{
			return false;
		}
	}
	public int getd(TreeNode t){
		if(t == null)
			return 0;
		int ld = getd(t.left);
		int rd = getd(t.right);
		if(ld > rd)
			return ld + 1;
		else
			return rd + 1;
	}
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


