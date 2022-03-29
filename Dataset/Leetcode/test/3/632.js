 var XXX = function(s) {
    let a = 1;
    let str = s.substring(0, a)
    while (!str.includes(s[a])) {
        a+=1
        str = s.substring(0, a)
    }
    return str.length
};

