var XXX = function(x) {
    if(x < 0) return false
    // let temp = x.toString();
    
    return x.toString() === x.toString().split("").reverse().join('') ? true : false
};

