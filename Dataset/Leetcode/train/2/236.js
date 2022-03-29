var XXX = function(l1, l2) {
	    const sum = Number(l1.reverse().join('')) + Number(l2.reverse().join(''))
	    return [...`${sum % (Math.pow(10, l1.length))}`].map(el => parseInt(el))
	};
XXX([1,2,7], [3,4,5])
// [2, 6, 4]

