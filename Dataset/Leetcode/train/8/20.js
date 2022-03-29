var XXX = function(s) {
    let n=parseInt(s)?parseInt(s):0
    if(n<=(-Math.pow(2,31))){
        return -Math.pow(2,31)
    }else if(n>=(Math.pow(2,31)-1)){
        return Math.pow(2,31)-1
    }
    return n
};

