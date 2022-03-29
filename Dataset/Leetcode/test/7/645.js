 var XXX = function(x) {
    let num = x.toString()
    let a = ''
    if(x<0){
        a += num.substr(0, 1)
        num = num.substr(1, num.length)
    }
    for(let i=num.length-1;i>=0;i--){
        a += num[i]
    }
    if(Number(a)>Math.pow(2,31)-1 || Number(a)<-Math.pow(2,31)){
        return 0 
    }
    return a
};

