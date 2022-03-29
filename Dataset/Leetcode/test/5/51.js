var XXX = function(s) {
    if(s.length<2){
        return s;
    }
    // dp[i][ii] 表示 i-ii是否是回文川
    // dp[i][ii] = dp[i+1][ii-1] + s[i] == s[ii]
    const dp=new Array(s.length).fill(0).map(item=>new Array(s.length));
    let res = s[0];
    for(var i =s.length-1;i>=0;i-=1){
        dp[i][i] = true;
        for(var ii= s.length-1;ii>i;ii-=1){
            dp[i][ii] = (i+1 > ii-1? true : dp[i+1][ii-1]) && s[i] == s[ii];
            if(dp[i][ii] && ii-i+1 >= res.length){
                res = s.slice(i,ii+1);
            }
        }
    }
    return res;
};

