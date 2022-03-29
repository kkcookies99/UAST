var XXX = function(n) {
    var res = 0;
    var numOf2 = Math.floor(n/2);
    var numOf1 = n - 2*numOf2;
    while(numOf2 >= 0) {
        res += cnm(numOf1 + numOf2, numOf2);
        numOf2--;
        numOf1 += 2;
    }
    return res;
};
function cnm(n, m) {
    var res = 1;
    for(var i = 0; i < m; i++) res *= (n-i)/(m-i);
    return res;
}

