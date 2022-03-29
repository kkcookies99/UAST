 var XXX = function(haystack, needle) {
    if(needle === '') {
        return 0 
    }
    const len = needle.length
    for(let i = 0; i < haystack.length; i++) {
        if(haystack[i] === needle[0]) {
           const hayStr = haystack.slice(i,i+len)
            if(hayStr === needle) {
                return i
            }
        }
    }
    return -1
};

