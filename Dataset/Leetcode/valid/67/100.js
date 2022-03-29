 var XXX = function(a, b) {
    let i = a.length - 1,
        j = b.length - 1,
        sum = '',
        rev = 0;
    while(a[i] || b[j]) {
        let x = a[i] ? a[i] : 0
        let y = b[j] ? b[j] : 0
        let diff = 2 - x - y - rev;
        if (diff < 1) {
            rev = 1;
            sum = (2 - diff) % 2 + sum;
        } else {
            rev = 0;
            sum = (2 - diff) + sum;
        }
        i--;
        j--;
    }
    if (rev) {
        sum = 1 + sum;
    }
    return sum;
};

