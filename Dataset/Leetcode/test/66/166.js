 var XXX = function(digits) {
    const stack = []
    const len = digits.length
    let carry = digits[len - 1] + 1 == 10 ? 1:0
    stack.unshift(carry === 1 ? 0 :  digits[len - 1] + 1)
    for( let i = len - 2; i >= 0; i-- ){
        stack.unshift((digits[i] + carry) % 10)
        carry = digits[i] + carry == 10 ? 1:0
    }
    if(carry == 1) stack.unshift(carry)
    return stack
};

