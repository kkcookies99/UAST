 var XXX = function(x) {
    if(x < 0) return false;
    var a = x + '';
    if(a.split('').reverse().join('') ===a){
        return true;
    } else {
        return false;
    }
    
};


