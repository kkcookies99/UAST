 var XXX = function(root) {
    if(!root){return []}
	var list = []
	var stack = []
	stack.push(root)
	while(stack.length !== 0){
		var arr = [],
			len = stack.length;
		for(var i = 0;i<len;i++){
			var item = stack.shift()
			arr.push(item.val)
			if(item.left){
				stack.push(item.left)
			}
			if(item.right){
				stack.push(item.right)
			}
		}
		list.push(arr)
	}
	return list
};

