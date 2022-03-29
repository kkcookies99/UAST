 var XXX = function(x) {
        var operX=x<0?String(Math.abs(x)):String(x),oper=x<0?'-':'',res=0;
        for(var i=operX.length-1;i>=0;i--){
            res+=operX.charAt(i);
        }
        return Number(oper+res)<Math.pow(-2,31)||Number(oper+res)>Math.pow(2,31)-1?0:Number(oper+res);
    };

