 var XXX = function(haystack, needle) {
    if(needle==''){
        return 0;
    }
    for(let i = 0; i<haystack.length; i++){
        let sign = false;
        if(haystack[i]==needle[0]){
            if(needle.length == 1) return i;
            for(let j = 1; j<needle.length; j++){
                if(needle[j]==haystack[i+j]){
                    sign = true;
                    continue;
                }else{
                    sign = false;
                    break;
                }
            }
            if(sign){
                return i;
            }
        }
    }
    return -1;
};

