 var XXX = function(num) {
    let keys = {M:1000, CM: 900, D:500, CD: 400, C:100, XC: 90, L:50, XL:40, X:10,  IX:9, V:5, IV:4, I:1};
    let result = '';
    for (let k in keys) {
        let n = keys[k];
        let a = parseInt(num / n);
        num = num % n;
        while (a--) {
            result += k;
        }
    }
    return result;
};

