 var XXX = function(a, b) {
    let i = carry = 0,
        res = [];
    while(i < a.length || i < b.length || carry){
        carry += a[a.length - i - 1] - 0 || 0;
        carry += b[b.length - i - 1] - 0 || 0;
        res.push(carry & 1);
        carry >>= 1;
        i++;
    }
    return res.reverse().join('');
};

