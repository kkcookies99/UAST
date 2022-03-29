 var XXX = function(haystack, needle) {
    if (needle === '') return 0
    let i = 0
    let j = 0
    while (i <  haystack.length) {
        if (haystack[i] === needle[j]) {
            i++
            j++
            if (j === needle.length) {
                return i -j
            }
        }else {
            if (j !== 0) {
                i = i -j + 1
            }else {
                i++
            }
            j = 0
        }
    }
    return -1
};

