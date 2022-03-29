 var XXX = function(strs) {
    if (!strs.length) {
        return ''
    }
    let i = 0
    while (strs.every(val => val[i] && strs[0][i] && val[i] === strs[0][i])) {
        i++
    }
    return strs[0].slice(0, i)
};

