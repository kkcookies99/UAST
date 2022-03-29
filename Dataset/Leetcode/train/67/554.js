var XXX = function(a, b) {
    var re = new Array();
    var len = Math.max(a.length,b.length),flag = 0;
    
    for (var i = len-1 ; i >=0 ; i-- ) {
        // 当前位
        re[i] = (Number(a[i-len+a.length] ? a[i-len+a.length] : 0) + Number(b[i-len+b.length] ? b[i-len+b.length] : 0) + flag) % 2;
        // 模拟进位
        flag = Math.floor((Number(a[i-len+a.length] ? a[i-len+a.length] : 0) + Number(b[i-len+b.length] ? b[i-len+b.length] : 0) + flag) / 2);
    }
    // 首位判断是否进位，进位加一个1
    if (flag > 0 ) {
        re.unshift(1);
    }

    
    return re.join('')
};

