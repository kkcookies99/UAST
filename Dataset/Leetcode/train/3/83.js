 var XXX = function(s) {
    if (s.length === 1 || s.length === 0) return s.length
    let temp = []
    temp.push(s[0])
    let len = temp.length
    let start_index = 0
    for (let i = 1; i < s.length; i++) {
        start_index = temp.indexOf(s[i])
        if (start_index !== -1) {
            temp = temp.slice(start_index + 1)
            temp.push(s[i])
        } else {
            temp.push(s[i])
            if (temp.length > len) {
                len = temp.length
            }
        }
    }
    return len
};

