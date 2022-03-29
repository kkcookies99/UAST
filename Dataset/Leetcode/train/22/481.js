 var XXX = function(n) {
	let l = n,
		r = 0,
		arrs = [new Obj(n - 1, 1, ['('])];
	for (let i = 1; i < 2 * n; i++) {
		arrs.forEach(n => {
			if (n.l > 0) {
				if (n.r > 0) {
					arrs.push(new Obj(n.l, n.r - 1, [...n.s,')']));
				}
				n.s.push('(') ;
				n.l--;
				n.r++;
			} else if (n.r > 0) {
				n.s.push(')')
				n.r--;
			}
		})
	}
	// console.log(arrs.map(n => n.s));
	return arrs.map(n => n.s.join());

	function Obj(l, r, s) {
		return {
			l: l,
			r: r,
			s: s
		}
	}
};


