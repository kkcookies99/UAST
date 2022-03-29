 var XXX = function(s, numRows) {
    if(numRows<=1)return s
    var res = ''
    for(var i=0;i<numRows;i++){
        var n = i
        var j = numRows-1
        while(n<s.length){
            res+=s[n];
            if(i==0||i==numRows-1){
                n = n + (numRows-1)*2
            }else{
                n = n + (j-n)*2//6
                j+=numRows-1
            }
        }
    }
    return res
};

