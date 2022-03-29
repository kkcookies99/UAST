 var XXX = function(s) {
    // Number(s)--忽略前导空格，遇到不合法返回NaN
    let num = parseInt(s);
    if(Object.is(num,NaN)) return 0;
    let min = -(2**31);
    let max = 2**31 - 1;
    if(num < min) num = min;
    if(num > max) num = max;
    return num;
};

