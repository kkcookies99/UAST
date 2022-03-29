var XXX = function(x) {
    if(x < 0 ) return false;
    var initNum = x;
    var res = 0;
    for(var i = 0; ; i++) {
        var temp = x % 10;
        x = parseInt(x / 10);
        res = temp + res * 10;
        if(x === 0) {
            break;
        }
    }
    return res === initNum;
};

