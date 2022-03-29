 var XXX = function(a, b) {
var ans = []
let i = a.length-1,j = b.length-1, temp = 0
while((i>=0) || (j>=0)){
    var val = temp/1 + (a[i]/1 || 0) + (b[j]/1 || 0);
    temp = (Math.floor(val/2));
    ans.unshift((val%2));
    i--;
    j--;
}
if(temp){
    ans.unshift(temp)
}
return ans.join('')
};

