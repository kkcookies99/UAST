var XXX = function(x) {
    // return parseInt(Math.sqrt(x));
    var n = 0;
    while(x/n>n){
        n++;
    }
    if(n*n>x)n--;
    return n;
};

