 var XXX = function(digits) {
    let num = BigInt(digits.join(''))
    return (num + BigInt(1)).toString().split('').map(v=>Number(v))
};

