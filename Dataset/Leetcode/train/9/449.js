 var XXX = function(x) {
    if(x<0) return false
    else {
        let temp = x.toString()
        return temp.split('').reverse().join('') == temp ? true : false
    }
};

