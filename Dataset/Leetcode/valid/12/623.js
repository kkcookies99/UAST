 var XXX = function(num) {
    let thousand = Math.floor(num / 1000)
    let now = num % 1000
    let hundred = Math.floor(now / 100)
    now %= 100
    let ten = Math.floor(now / 10)
    now %= 10
    let digit = now
    let res = ''
    for(let i = 0; i < thousand; i++) {
        res += 'M'
    }
    if(hundred) {
        if(hundred === 4) {
            res += 'CD'
        }else if(hundred === 9) {
            res += 'CM'
        }else if(1 <= hundred && hundred < 5) {
            let str = ''
            for(let i = 0; i < hundred; i++) {
                str += 'C'
            }
            res += str
        }else {
            let str = ''
            for(let i = 0; i < hundred - 5; i++) {
                str += 'C'
            }
            res += (hundred - 5 === 0) ? 'D' : 'D' + str
        }
    }
    if(ten) {
        if(ten === 4) {
            res += 'XL'
        }else if(ten === 9) {
            res += 'XC'
        }else if(1 <= ten && ten < 5) {
            let str = ''
            for(let i = 0; i < ten; i++) {
                str += 'X'
            }
            res += str
        }else {
            let str = ''
            for(let i = 0; i < ten - 5; i++) {
                str += 'X'
            }
            res += (ten - 5 === 0) ? 'L' : 'L' + str
        }
    }
    if(digit) {
        if(digit === 4) {
            res += 'IV'
        }else if(digit === 9) {
            res += 'IX'
        }else if(1 <= digit && digit < 5) {
            let str = ''
            for(let i = 0; i < digit; i++) {
                str += 'I'
            }
            res += str
        }else {
            let str = ''
            for(let i = 0; i < digit - 5; i++) {
                str += 'I'
            }
            res += (digit - 5 === 0) ? 'V' : 'V' + str
        }
    }
    return res
};

