 var XXX = function(strs) {
    if (strs.length === 0) {
        return '';
    }
    if (strs.length === 1) {
        return strs[0];
    }
    if (strs.length > 2) {
        strs = strs.sort();
    }
    let result = [];
    for (let i = 0; ; i++) {
        if (i < strs[0].length && i < strs[strs.length - 1].length && strs[0][i] === strs[strs.length - 1][i]) {
            result.push(strs[0][i]);
        } else {
            break;
        }
    }
    return result.join('');
};

