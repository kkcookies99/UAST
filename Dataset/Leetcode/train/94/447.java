     public List<Integer> XXX(TreeNode root) {
		if(root == null) {
			return new ArrayList<Integer>();
		}
		List<Integer> res = new ArrayList<Integer>();
		TreeNode cur = root;
		TreeNode mr = null;
		
		while(cur != null) {
			mr = cur.left;
			if(mr != null) {
				while(mr.right != null && mr.right != cur) {
					mr = mr.right;
				}
				if(mr.right == null) {
					mr.right = cur;
					cur = cur.left;
					continue;
				}else {
					mr.right = null;
				}
			}
			res.add(cur.val);
			cur = cur.right;
		}
		return res;
    }

