 var XXX = function(haystack, needle) {
    var haystackLen = haystack.length,
        needleLen = needle.length;
    if (needleLen == 0) return 0;
    var prefix = needle.charAt(0);
    for (var i = 0; i < haystackLen; i++) {
        if (prefix == haystack[i]) {
            var start = i;
            var end = i + needleLen;
            if (end > haystackLen) {
                return -1;
            }
            if (haystack.substring(start, end) == needle) {
                return start;
            }
        }
    }
    return -1;
};

