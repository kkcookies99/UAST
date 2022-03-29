var XXX = function(x) {
    // 二分查找，用x/m<m而不是m*m>x防止溢出
    if (x === 1) {
        return 1;
    }
    let min = 0;
    let max = x;
    while(max - min > 1) {
        let mid = Math.floor((min + max) / 2);
        if (x / mid < mid) {
            max = mid
        } else {
            min = mid
        }
    }
    return min;
};

