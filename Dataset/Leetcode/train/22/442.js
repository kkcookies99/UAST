 var XXX = function(n) {
    const result = [];
    function per(l,r,unClosedLeftCount,str) {
        if(l === 0 && r === 0 ) {
            result.push(str);
            return;
        }
        if(l > 0){
            per(l-1,r,unClosedLeftCount + 1,str+'(')
        }
        if(r > 0 && unClosedLeftCount > 0){
            per(l,r-1,unClosedLeftCount-1,str+')')
        }
    }
    per(n-1,n,1,'(');
    return result;
};

