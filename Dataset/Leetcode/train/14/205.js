 var XXX = function(strs) {
    return ((firstStr = '') => (arr => arr[arr.length - 1] || '')(Array(firstStr.length)
        .fill()
        .map((_, index) => firstStr.slice(0, index + 1))
        .filter(item => strs.every(str => str.startsWith(item)))))(strs[0])
};

