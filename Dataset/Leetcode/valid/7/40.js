var XXX = function(x) {
    var max = Math.pow(2, 31) - 1;
    var min = -Math.pow(2, 31);
    var y = 0;
    while(x !== 0) {
        y = 10 * y + x % 10;
        x = ~~(x/10);
    }
    if (y > max) return 0;
    if (y < min) return 0;
    return y;
};

