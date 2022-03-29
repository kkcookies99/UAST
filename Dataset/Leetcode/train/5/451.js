 var XXX = function(s) {
	const ds = (m, n) => {
		for( ; ; ){
			if(m >= 0 && n < s.length & s[m] == s[n]){
				m--;
				n++;
			}else{
				break;
			}
		}
		res = n - m - 1 > res.length ? s.slice(m + 1, n) : res;
	}
	if(s.length <= 1){
		return s;
	}
	let res = "";
	for(let i = 0; i < s.length; i++){
		ds(i, i);
		ds(i, i + 1);
	}
	return res;
};

