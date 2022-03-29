 var XXX = function(digits) {
    return ((BigInt(digits.join('')) + 1n).toString().split('')).map(item => Number(item))
};

