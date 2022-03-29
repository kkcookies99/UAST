 var XXX = function(s) {
    let maxLen = 0;
    let str = '';
    for(let val of s){
        let index = str.indexOf(val);
        str = str.substring(index + 1) + val;
        maxLen = Math.max(maxLen, str.length);
    }
    return maxLen;
};

