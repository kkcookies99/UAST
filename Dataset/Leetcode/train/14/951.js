 var XXX = function(strs) {
    	let length = strs.length;
	if (length === 0) return '';
	if (length === 1) return strs[0];

	strs = strs.sort((a, b) => a.length - b.length);
	let str = '';
	for (let i = 0, len = strs[0].length; i < len; i++) {
		for (let k = 1; k < length; k++) {
			// 只要有一项无法相等  那么直接返回结果
			if (strs[k][i] !== strs[0][i]) {
				return str;
			}
		}
	         str += strs[0][i];
	}
	return str;
};

