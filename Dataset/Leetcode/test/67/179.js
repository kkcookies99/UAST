 var XXX = function(a, b) {
    var l = Math.max(a.length,b.length);
    var j = 0;
    var s = "";
    for(var i=0;i<l||j;i++){
        var na = a.length-1-i>=0?parseInt(a[a.length-1-i]):0;
        var nb = b.length-1-i>=0?parseInt(b[b.length-1-i]):0;
        if(na+nb==2){
            s=j+s;
            j = 1;
        }else if(na+nb+j==2){
            s=0+s;
            j = 1;
        }else{
            s = na+nb+j+s;
            j = 0;
        }
    }
    return s;
};

