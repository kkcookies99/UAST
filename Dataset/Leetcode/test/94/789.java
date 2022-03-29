 class Solution {
    public List<Integer> XXX(TreeNode root) {
        if (root == null)
			return new ArrayList<>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode cur = root;
        TreeNode pre;
        while (cur != null) {
        	// 如果当前节点的左子节点不为空
        	if (cur.left != null) {
        		// 找到当前节点的前序节点
        		pre = cur.left;
        		while (pre.right != null && pre.right != cur) {
        			pre = pre.right;
        		}
        		// 如果前序节点的右子节点为空，则将右子节点指向当前节点，当前节点变为
        		// 左子节点
        		if (pre.right == null) {
        			pre.right = cur;
        			cur = cur.left;
        		} else {
        			// 否则就将前序节点的右子节点设为空，输出当前节点，
        			// 当前节点变为右子节点
        			pre.right = null;
        			result.add(cur.val);
        			cur =  cur.right;
        		}
        	} else {
        		// 输出当前节点，当前节点指向右子节点
        		result.add(cur.val);
        		cur = cur.right;
        	}
        }
        
        return result;
    }
}

