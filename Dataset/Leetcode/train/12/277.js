 var XXX = function(num) {
    const romans = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
    const nums = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
    const len = romans.length

    let res = ''

    while (num > 0) {
        for (let i = 0; i < len; i++) {
            if (num - nums[i] < 0) continue
            res += romans[i]
            num -= nums[i]
            break
        }
    }

    return res
};

