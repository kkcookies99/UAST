 var XXX = function(haystack, needle) {
    let m = needle.length;
    let s = haystack.length;
    let index = -1;
    
    if (m === 0 || haystack === needle) return 0

    for (let i = 0; i < s; i++) {
        if (haystack[i] === needle[0]) {
           let flag = true;
           for (let j = 0; j < m.length; j++) {
               if (needle[j] !== haystack[i+j]) {
                   flag = false
                   break;
               }
           }
           if (flag) {
               return i
           }
        }
    }
    return index;
};

