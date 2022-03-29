 var XXX = function(haystack, needle) {
    
    let needle_length = needle.length;
    if (needle_length == 0) return 0;
    let cur_pos = 0
    while (cur_pos < haystack.length) {
        if (haystack[pos] == needle[0] && isNeedle(haystack, cur_pos, needle))
            return cur_pos
        else cur_pos++;
    }

    function isNeedle(haystack, cur_pos, needle) {
        let pos = cur_pos;
        for (let i = 0; i < needle.length; i++){
            if (haystack[pos] != needle[i]) return false
            else pos++;
        }
        return true
    }
};

