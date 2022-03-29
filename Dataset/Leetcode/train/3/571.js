 var XXX = function(s) {
    // char -> index
    const repeatMap = new Map()
    let res = 0
    let start = 0

    for(let ind = 0; ind < s.length; ind++) {
        const curChar = s[ind]
        const repeatInd = repeatMap.get(curChar)
        repeatMap.set(curChar, ind)
        res = Math.max(res, ind - start)
        if (repeatInd !== undefined && repeatInd >= start) {
            start = repeatInd + 1
        }
    }
    return Math.max(s.length - start, res)
};

