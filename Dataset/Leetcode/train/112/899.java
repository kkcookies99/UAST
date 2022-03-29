 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) 
			return false;
		Stack<TreeNode> queue = new Stack<>();
		Stack<Integer> num = new Stack<>();
		int count = 0;
		queue.push(root);
		num.push(root.val);
		TreeNode p;
		while(!queue.isEmpty()) {
			p = queue.pop();
			count = num.pop();
			if(p.left == null && p.right == null) {
				if (count == sum) 
					return true;
				continue;
			}
			if(p.left != null) {
				queue.push(p.left);
				num.push(count + p.left.val);
			}
			if(p.right != null) {
				queue.push(p.right);
				num.push(count + p.right.val);
			}
		}
        return false;
    }
}

