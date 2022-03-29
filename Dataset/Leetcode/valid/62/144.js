 var XXX = function(m, n) {
    if(m === 1 || n === 1) return 1;
    m--, n--;
    var res = 1;
    for(var i = m + 1; i <= m + n; i++) res *= i/(i-m);
    return res;
};

