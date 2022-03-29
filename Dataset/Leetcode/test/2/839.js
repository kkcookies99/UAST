 var XXX = function(l1, l2) {
    const length = Math.max(l1.length, l2.length);
    let add1 = 0; // 两数相加 大于 10 进1,否则为0
    const result = [];
    for (let i=0; i<length; i++) {
        const sum = (l1[i]||0) + (l2[i]||0) + add1;
        result[i] = sum % 10;
        add1 = Math.floor(sum/10);
    }
    return result;
};

