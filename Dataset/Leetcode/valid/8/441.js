  var XXX = function(s) {
    let num = 0;
    s.replace(/^(\+|\-)?(\d+)(\w*)/g,(item,$1,$2) => {
        if(typeof $1 == 'undefined') { 
            if($2) {
                num = +$2;
                return;
            }else{
                num = 0;
                return;
            }
        }else {
            if($2) {
                 num = Number($1+$2);
                 return;
            }else{
                num = 0;
                return;
            }
        }
    })
    let min = -(2**31);
    let max = 2**31 - 1;
    if(num < min) num = min;
    if(num > max) num = max;
    return num;
};

