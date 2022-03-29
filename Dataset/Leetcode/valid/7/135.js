var XXX = function(x) {
	const ds = (x, control) => {
		let arr = new Array();
		let res = "";
		arr = (x + "").split("");
		arr.XXX();
		res = arr.join("");
		return parseInt(res) > (Math.pow(2,31) - 1) ? 0 : parseInt(res) * control;
	}
	if(x == 0){
		return 0;
	}else if(x > 0){
		return ds(x, 1);
	}else{
		return ds(-x, -1);
	}
};

