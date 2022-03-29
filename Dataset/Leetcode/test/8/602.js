 var XXX = function(s) {
    const regNum = s.trim().match(/^[\+\-]?\d+/)
    return Math.max(Math.min(Number(regNum?regNum[0]:0),Math.pow(2,31)-1),-Math.pow(2,31))
};

