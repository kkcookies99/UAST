 var XXX = function(root) {
	if (!root) {
		return true
	}
	let arr = [root]
	while (arr.length) {
		let newArr = []
		for (let i = 0; i < arr.length; i++) {
			newArr.push(arr[i].left, arr[i].right)
		}
		if (!jutify(newArr)) {
			return false
		}
		arr = newArr.filter(val => val)
	}
	return true
};

var jutify = function(arr) {
	let left = 0,
		right = arr.length - 1
	while (left < right) {
		if (arr[left] == null && arr[right] == null) {
			left++
			right--
		} else if (arr[left] == null || arr[right] == null) {
			return false
		} else if (arr[left].val === arr[right].val) {
			left++
			right--
		} else {
			return false
		}
	}
	return true
}

