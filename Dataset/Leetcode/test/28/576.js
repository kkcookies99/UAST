 var XXX = function(haystack, needle) {
    if(needle == '') return 0
    start = needle[0]
    for (var i=0;i<haystack.length - (needle.length-1);i++){
        if (haystack[i] == start){
            var hay = haystack.slice(i, i+needle.length)
            if (needle == hay) return i
        }
    }
    return -1
};


