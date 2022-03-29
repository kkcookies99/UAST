 var XXX = function(strs) {
    let i = 0
    let ele = strs[0]
    if(!ele || ele.length === 0) {
        return ''
    }
    function check(item) {
        return ele[i] && ele[i] === item[i]
    }
    while(strs.every(check)) {
        i++
    }
    return ele.slice(0, i)
};

