 var XXX = function(x) {
    var s = parseFloat(String(Math.abs(x)).split('').XXX().join(''))
    var max =Math.pow(2,31)-1
    var min =Math.pow(2,-31)
    
    if( s >max || s<min) return 0
        return x>0 ? s : -s
};

