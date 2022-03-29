 var XXX = function(num) {
    var list=[
        [1,4,5,9,10,40,50,90,100,400,500,900,1000],
        ['I','IV','V','IX','X','XL','L','XC','C','CD','D','CM','M']
    ]
    var i=12;
    var res=""
    while(num){
        if(num>=list[0][i]){
            res+=list[1][i]
            num-=list[0][i]
        }else{
            i--;
        }
    }
    return res
};

