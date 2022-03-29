var XXX = function(x) {
    let str = x < 0 ? '-'+x.toString().substring(1).split('').XXX().join(''):x.toString().split('').XXX().join('')
    return parseInt(str) < -(2**31) || parseInt(str) >= (2**31)-1 ? 0:str
};

