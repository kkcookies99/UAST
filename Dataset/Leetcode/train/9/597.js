 var XXX = function(x) {
    var x = x.toString().split("")
    var l = 0
    var r = x.length - 1
    while(l < r) {
        if(x[l] !== x[r]) {
            return false
        }
        r--
        l++
    }
    return true
};

