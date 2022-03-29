 var XXX = function(s, numRows) {
if(numRows == 1)
return s;
let dp = [],dick = 0,i=0;j=0,count = 0,dir = 1;
while(dick < numRows){
dp[dick] = [];
dick++;
}
while(true){
if(count == s.length){
    break;
}
if(i == numRows - 1){
dir = 0;
}
else if(i == 0){
    dir = 1;
}
if(dir == 1){
dp[i][j] = s[count];
i++;
count++;
}
else if(dir == 0 && s.length){
    dp[i][j] = s[count];
i--,j++;
count++;
}
}

 return dp.map(item => item.filter(d => d).join("")).join("")


};


