 //dp[i][j]为1表示第i个字符到第j个字符是回文，0表示不是回文。len表示当前最大回文长度
//start与end储存当前最长的开始与结束坐标
var XXX = function(s) {
    if(s.length==0)
        return '';
    var dp=new Array(s.length).fill(0).map(function(a){
        return new Array(s.length).fill(0);
    });
    var start=0,
        end=0,
        len=1;
    for(var i=s.length-1;i>-1;i--){
        dp[i][i]=1;
        for(var ii=i+1;ii<s.length;ii++){
            if(s[i]==s[ii]){
                if(i+1>ii-1)
                    dp[i][ii]=1;
                else
                    dp[i][ii]=dp[i+1][ii-1];
            }else{
                dp[i][ii]=0;
            }
            if(dp[i][ii]==1){
                if(ii-i+1>len){
                    start=i;
                    end=ii;
                    len=ii-i+1;
                }
            }
        }
    }
    return s.slice(start,end+1);
};

