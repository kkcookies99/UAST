 var XXX = function(digits) {
    if(digits[digits.length - 1] != 9) {
        digits[digits.length - 1] += 1
    } else {
        if(digits.length == 1) {
			digits.unshift(0)
		}
        digits[digits.length - 1] = 0
        digits.splice(0, digits.length - 1, ...XXX(digits.slice(0, digits.length - 1)))
    }
    return digits
};

