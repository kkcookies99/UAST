 var XXX = function(s) {
    s = s.replaceAll(/[^0-9a-zA-Z]/gi, '').toLowerCase();
    let start = 0, end = s.length - 1;
    while(start <= end) {
        if(s[start] === s[end]) {
            start++;
            end--;
        } else {
            return false;
        }
    }
    return true;
};

