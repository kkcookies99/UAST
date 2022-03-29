var XXX = function(x) {
    var t  =  x;
    x = Math.abs(x)

    var str = '';
    while(x>0){
        a = x % 10;
        x = parseInt(x/10);
        str += a;
    }
    if(Number(str)>2**31-1){
        return 0;
    }
    if(t<0){
        str = '-'+str;
    }
    return Number(str);
};

