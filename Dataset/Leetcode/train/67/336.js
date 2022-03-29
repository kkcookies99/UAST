 var XXX = function(a, b) {
	var sum = "";
	var i = a.length - 1;
	var j = b.length - 1;
	var add = 0;
	while(i >= 0 || j >= 0){
		var ta = i >= 0 ? a.charAt(i) & 1 : 0;
		var tb = j >= 0 ? b.charAt(j) & 1 : 0;
		var t = ta + tb + add;
		if(t >= 2){
			t = t -2;
			add = 1;
		}else {
			add = 0;
		}
		sum = t + sum;
		i --;
		j --;
	}
	if(add > 0){
		sum = add + sum;
	}
	return sum;
};

