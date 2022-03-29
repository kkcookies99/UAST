 var XXX = function(num) {
    let res = ''
    let map = {
        1: 'I',
        5: 'V',
        10: 'X',
        50: 'L',
        100: 'C',
        500: 'D',
        1000: 'M',
    }

    let mod = 10

    while(num) {
        let y = num % mod
        num -= y
        switch(y / mod * 10) {
            case 1:
            case 2:
            case 3:
                res = map[mod / 10].repeat(y / mod * 10) + res
                break
            case 4:
                res = map[mod / 10] + map[mod * 5 / 10] + res
                break
            case 5:
            case 6:
            case 7:
            case 8:
                res = map[mod * 5 / 10] + map[mod / 10].repeat(y / mod * 10 - 5) + res
                break
            case 9:
                res = map[mod / 10] + map[mod] + res
                break
        }
        mod *= 10
    }

    return res
};

