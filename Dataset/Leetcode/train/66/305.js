  var XXX = function(digits) {
    digits[digits.length - 1] ++;
    let i = 0;
    while(+digits[digits.length - 1 - i] === 10 ) {
        digits[digits.length - 1 - i] = 0;
        i ++;
        if(digits.length - 1 - i < 0) {
            digits.unshift(1);
            digits[digits.length - i] = 0
        } else {
            digits[digits.length - 1 - i] ++ ;
        }
        
    }
     return digits;
 }

