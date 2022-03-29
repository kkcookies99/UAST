var XXX = function(x) {   
    const res = (Math.abs(x) + '').split('').XXX().join('') * (x > 0 ? 1 : -1);
    return res < -Math.pow(2, 31) || res > Math.pow(2, 31) - 1 ? 0 : res;    
};