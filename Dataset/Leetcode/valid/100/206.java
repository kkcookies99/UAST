     public boolean XXX(TreeNode p, TreeNode q) {
		if (p == null & q == null)
			return true;

		if (p == null || q == null)
			return false;

		if (p.val != q.val)
			return false;

		return XXX(p.right, q.right) && XXX(p.left, q.left);

    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


