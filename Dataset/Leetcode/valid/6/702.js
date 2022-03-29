 var XXX = function(s, numRows) {
    if(numRows == 1) return s;
    var arr = [];
    var flag = true;
    var nowI = 0;
    for(var i =0; i < s.length; i++){
        arr[nowI] = arr[nowI]?arr[nowI] + s.charAt(i):s.charAt(i);
        if(flag){
            nowI++;
            if(nowI == numRows-1){
                flag = !flag;
            }
        }else{
            nowI--;
            if(nowI == 0){
                flag = !flag;
            }
        }
    }
    var res = arr.join('');
    return res;
};

