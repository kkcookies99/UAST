 var XXX = function(s) {
    if(s.length===0) return 0;
    let start = 0;
    let result = 1;
    let hashMap = {};
    hashMap[s[0]] = 0
    for (let i = 1,len = s.length; i < len; i++) {
       if(hashMap[s[i]]>=start)  start = hashMap[s[i]]+1;
       let current = i-start+1
        hashMap[s[i]] = i
        result = Math.max(result,current)
    }
    return result
};

