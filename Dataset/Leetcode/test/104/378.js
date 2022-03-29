var XXX = function(root) {
	if(!root)
		return 0
	root.depth = 1;
	let max = 1;
	function deep (root) {
		if(root.left){
			root.left.depth = root.depth + 1
			max = Math.max(root.depth + 1, max)
			deep(root.left)
		}
		if(root.right){
			root.right.depth = root.depth + 1
			max = Math.max(root.depth + 1, max)
			deep(root.right)
		}
	}
	deep(root)
	return max
}

