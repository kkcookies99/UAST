 var XXX = function(digits) {
    var loc = digits.length - 1
    function plus(digits, loc){
        if (loc < 0) digits.unshift(1)
        else{
            if (digits[loc] != 9) digits[loc] += 1
            else{
                digits[loc] = 0
                plus(digits, loc-1)
            }
        }
    }
    plus(digits, loc)
    return digits
};

