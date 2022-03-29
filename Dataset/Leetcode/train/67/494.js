var XXX = function(a, b) {
    const len  = Math.max(a.length, b.length)
    a = a.padStart(len, '0')
    b = b.padStart(len, '0')
    let carry = 0 
    let sum = ''
    for (let i=len-1; i>=0;i--) {
        sum = (a[i] ^ b[i] ^ carry) + sum
        carry = (a[i] & b[i]) | (a[i] & carry) | (b[i] & carry)
    }
    return carry === 1 ? 1 + sum : sum
};

