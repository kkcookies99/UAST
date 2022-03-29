 class Solution {

    public List<Integer> XXX(TreeNode root) {
		List<Integer>ans = new ArrayList<>();
		// dfs
		Deque<TreeNode>stack = new LinkedList<>();
		while(root!=null||!stack.isEmpty()){
			// 循环中push进root，减少判断
			// 走到底
			while (root!=null){
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			ans.add(root.val);
			// 向右找就OK了
			root = root.right;
		}
		return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


