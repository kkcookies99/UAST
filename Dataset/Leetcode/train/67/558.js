var XXX = function(a, b) {
    if(a.length<1||a.length>10000||b.length<1||b.length>10000){
        return false
    }
    var anum=parseInt(a,2)
    var bnum=parseInt(b,2)
   
    var result=Number(anum+bnum)
    return result.toString(2)
    
};

