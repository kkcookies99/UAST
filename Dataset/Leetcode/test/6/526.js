 var XXX = function(s, numRows) {
    var arr = Array(numRows).fill(0).map(x => []),
    flag = -1,
    line = 0;
    if(numRows === 1) return s;
    for(i = 0; i < s.length; i++){
        arr[line].push(s[i]);
        if(line === 0 || line === (numRows-1)) flag = -flag;
        line += flag;
    }
    return arr.flat(1).join('');
};

