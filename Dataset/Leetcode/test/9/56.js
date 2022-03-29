var XXX = function(x) {
    if(x>=0&&x<=(Math.pow(2,31)-1)){
            var y = x;
            var n=0;
            var len = x.toString().length;
            for(let i=0;i<len;i++){
                n = n*10+x%10;
                x=parseInt(x/10);
            }
            if(n==y){
                return true;
            }
            else{
                return false;
            }
        }
    return false;
};

