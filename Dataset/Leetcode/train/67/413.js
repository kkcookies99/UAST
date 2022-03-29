var XXX = function(a, b) {
    let i = a.length - 1;
    let j = b.length - 1;
    let result = [];
    let pre = 0;
    while(i > -1 || j > -1) {
        pre += (i > -1 && a[i] === '1') ? 1 : 0;
        pre += (j > -1 && b[j] === '1') ? 1 : 0;
        result.push((pre === 1 || pre === 3) ? 1 : 0);
        pre = pre > 1 ? 1 : 0;
        i--;
        j--;
    }
    if (pre === 1) result.push(1);
    return result.reverse().join('');
};

