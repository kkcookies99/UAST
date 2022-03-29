 var XXX = function(s, numRows) {
    var len=s.length;
    var n=numRows;
    if(n==1) return s;
    var cols=Math.ceil(len/(n*2-2));
    var res='';
    for(var row=0;row<n;row++){
        for(var col=0;col<cols;col++){
            res+=s.charAt(2*col*(n-1)+row)
            if(row!=0&&row!=n-1){
                res+=s.charAt(2*col*(n-1)+row+2*(n-row-1))
            }
        }
    }
    return res;
};

