 var XXX = function(s) {
    let minIndex = 0
    let ans = 0
    for(let i = 0; i < s.length; i++){
        if(s.indexOf(s[i], minIndex) < i) minIndex = s.indexOf(s[i], minIndex) + 1
        else ans = Math.max(ans, i - minIndex + 1)
    }
    return ans
};

