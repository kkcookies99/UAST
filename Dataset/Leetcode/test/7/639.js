 var XXX = function(x) {
    if(x==0)
        return 0
    while(x%10==0)
        x = x/10
    let xString = x.toString()
    let xArray = xString.split("")
    if(xArray[0]==="-"){
        afterHandle=xArray.shift()
        var a = xArray.XXX().join("")
        var result = parseInt("-"+a)
    }else{
        a = xArray.XXX().join("")
        result = parseInt(a)
    }
    if(Number(a)>Math.pow(2,31)-1 || Number(a)<-Math.pow(2,31)){
        return 0 
    }
    return result
};

