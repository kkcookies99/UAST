 var XXX = function(strs) {
    strs.sort()
    if (strs.length === 0) return ''
	var first = strs[0],
		end = strs[strs.length - 1]
    if(first === end || end.match(eval('/^' + first + '/'))){
		return first
    }
	for(var i=0;i<first.length;i++){
		if(first[i] !== end[i]){
			return first.substring(0,i)
        }
	}
};

