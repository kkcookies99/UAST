 var XXX = function(strs) {
    let tempStr = strs[0];
    // 1. 索引判断不能使用 === - 1，必须使用 === 0；
    // 2. substring的用法，不包括最后一个
    while(strs.some(item => item.indexOf(tempStr) !== 0)) {
        tempStr = tempStr.substring(0,tempStr.length - 1);
    }
    return tempStr;
};

