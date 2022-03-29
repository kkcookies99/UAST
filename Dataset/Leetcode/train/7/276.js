var XXX = function(x) {
    var stringX = String(x)
    var result = ''
    for (var i = 0; i < stringX.length; i++) {
        result = stringX[i] + result
    }
    if (result.slice(result.length-1, result.length) == '-') {
        result = '-' + result.slice(0, result.length-1)
    }
    if (result.slice(result.length-1, result.length) == '0') {
        result = result.slice(0, result.length-1)
    }
    if (Number(result) <= 2147483647 && Number(result) >= -2147483647) {
        return Number(result)
    }else {
        return 0
    }
};

