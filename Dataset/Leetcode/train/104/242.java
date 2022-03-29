class Solution {
    public int XXX(TreeNode root) {
        if(root == null) {
			return 0;
		}
		TreeNode curNode = root;
		TreeNode mostRightNode = null;
		int curLevel = 0;
		int maxHeight = Integer.MIN_VALUE;
		while (curNode != null) {
			mostRightNode = curNode.left;
			if(mostRightNode != null) {// 当前节点有左子树
				int leftTreeRightSize = 1;// cur左子树上右边界的个数
				// 找到cur左子树最右节点
				while(mostRightNode.right != null && mostRightNode.right != curNode) {
					leftTreeRightSize++;
					mostRightNode = mostRightNode.right;
				}
				if(mostRightNode.right == null) {
					// 第一次到达cur
					curLevel++;
					mostRightNode.right = curNode;
					curNode = curNode.left;
					continue;
				} else {
					// 第二次到达cur
					if(mostRightNode.left == null) {
						maxHeight = Math.max(maxHeight, curLevel);
					}
					curLevel -= leftTreeRightSize;
					mostRightNode.right = null;
				}
			} else {
				curLevel++;
			}
			curNode = curNode.right;
			
		}
		//查找整棵树的最右节点
		int finalRight = 1;
		curNode = root;
		while(curNode.right != null) {
			finalRight++;
			curNode = curNode.right;
		}
        //如果整棵树的最右节点是叶节点，更新最小高度
		if(curNode.left == null && curNode.right == null) {
			maxHeight = Math.max(maxHeight, finalRight);
		}
		
		return maxHeight;
    }
}

