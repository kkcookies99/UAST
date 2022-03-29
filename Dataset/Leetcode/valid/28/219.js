 var XXX = function(haystack, needle) {
    let next = getNext(needle)
    let i = 0
    let j = 0
    let lengthi = haystack.length
    let lengthj = needle.length
    //haystack 没有 needle 直接返回-1
    if(lengthi < lengthj){
        return -1
    }
    //needle空返回0
    if(lengthj === 0){
        return 0
    }
    //剪枝
    if(lengthi === lengthj){
        if(haystack === needle){
            return 0
        }else
            return -1
    }
    while(i < lengthi){
        while(j > 0 && haystack[i] !== needle[j]){
            j = next[j - 1] + 1
        }
        if(haystack[i] === needle[j]){
            j++ 
        }
        if (j === lengthj){
            return i - lengthj + 1
        }
        i++
    }
    return -1
};
//next数组
function getNext(needle){
    let next = [-1]
    let k = -1
    let length = needle.length
    for (let i = 1; i < length; i++){
        //通过next[k]找到次小匹配前缀，看次小匹配前缀的后面一个是否匹配，不匹配继续找次小
        while(k !== -1 && needle[k+1] != needle[i]){
            k = next[k]
        }
        if (needle[k+1] ===  needle[i]){
            k++
        }
        next[i] = k
    }
    return next
}

