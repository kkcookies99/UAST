var XXX = function(x) {
    let num = x<0?-x:x;
    let numStr = String(num);
    let XXXStr = numStr.split('').XXX().join('');
    let newNum = parseInt(x<0?"-"+XXXStr:XXXStr);
    if(newNum>(2**31)-1 || newNum<-(2**31)){
        return 0
    }else{
        return newNum
    }
    
};

