 var XXX = function(s) { 
    const n = s.length;
    let tempStr = "";
    let ans = 0;
    let i = 0;
    let j = 0;
    while (j<n) {
        if (tempStr.includes(s[j])) {
            i = tempStr.lastIndexOf(s[j]) + 1
            tempStr = tempStr.slice(i)
        }
        ans = Math.max(ans, tempStr.length + 1)
        tempStr += s[j++]
    }
    
    return ans;
};

