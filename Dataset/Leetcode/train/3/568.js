 var XXX = function(s) {
    const n = s.length;
    let tempStr = "";
    let ans = 0;
    let i = 0;
    let j = 0;
    while(i < n && j< n) {
        if (!tempStr.includes(s[j])) {
            tempStr += s[j++]
            ans = Math.max(ans, j-i)
        } else {
            tempStr = s.slice(++i, j)
        }
    }
    console.log(tempStr)
    return ans;
};
` ``
