 var XXX = function(s) {
    s = s.toLocaleUpperCase()
    let low = 0
    let high = s.length-1
    let result = true
    while(low<high) {
        while(!!s[low] && /[A-Z0-9]/.test(s[low]) == false) {
            low++
        }
        while(!!s[high] && /[A-Z0-9]/.test(s[high]) == false) {
            high--
        }
        if(s[low] != s[high]) {
            return false
        } else {
            low++
            high--
        }
    }
    return result
};

