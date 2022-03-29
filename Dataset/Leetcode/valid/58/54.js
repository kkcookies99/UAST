 var XXX = function(s) {
    ss = s.split(' ')
    for (let i=ss.length-1; i>=0; i--) {
        if (ss[i].length > 0) {
            return ss[i].length
        }
    }
    return 0

};

