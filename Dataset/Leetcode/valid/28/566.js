 var XXX = function(haystack, needle) {
    let i=0
    if(haystack==null||!needle) return 0
    while(i<haystack.length){
        //从haystack中依次截取needle长度的字符串和needle比较，若全等则返回当前i
        if(haystack.substr(i,needle.length)===needle){
            return i
        }
        i++
    }
    return -1
};

