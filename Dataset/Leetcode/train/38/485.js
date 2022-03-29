 var XXX = function(n) {
    if(n==1){
        return '1';
    }
    let str = XXX(n-1);
    let count = 0;
    let cur = '';
    let res = '';
    //对前一项进行描述
    for(let val of str){
        if(count == 0){
           cur = val; 
        }
        if(cur != val){
            res += count + cur;
            count = 1;
            cur = val; 
        }else{
            count ++;
        }
    }
    res += count + cur;
    return res;
};

