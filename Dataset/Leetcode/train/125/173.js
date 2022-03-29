 var XXX = function(s) {
    s = s.toLowerCase()
    let i = 0;
    let j = s.length - 1
    
    while (i < j) {
        if(s.charCodeAt(i)  == s.charCodeAt(j) ) {
            i++
            j--
        }else if(s.charCodeAt(i) > 122 || (s.charCodeAt(i) < 97 && s.charCodeAt(i) > 90) || (s.charCodeAt(i) < 65 && s.charCodeAt(i) > 57) || s.charCodeAt(i) < 48) {
            i++
        }else if(s.charCodeAt(j) > 122 || (s.charCodeAt(j) < 97 && s.charCodeAt(j) > 90) || (s.charCodeAt(j) < 65 && s.charCodeAt(j) > 57) || s.charCodeAt(j) < 48) {
            j--
        }else {
            return false
        }
    }
    return true
};

