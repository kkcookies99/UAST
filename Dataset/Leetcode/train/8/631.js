 var XXX = function(s) {
    let pos = 1, result = 0, start = false
    let LIMIT = Math.pow(2, 31)
    for(let i=0; i < s.length; i++) {
        if(s[i]==' ' && !start)  continue
        if(s[i]=='+' && !start) {
            pos = 1
            start = true
            continue
        }
        if(s[i]=='-' && !start) {
            pos = -1
            start = true
            continue
        }
        if(!(s[i]>='0' && s[i]<='9')) break
        start = true
        result = result*10 + (s[i] - '0')
    }
    result = result*pos
    if(result < -LIMIT ) return -LIMIT
    if(result > LIMIT-1) return LIMIT-1
    return result
};

