 var XXX = function(s) {
    let lou = ['I', 'IV', 'V', 'IX', 'X', 'XL', 'L', 'XC', 'C', 'CD', 'D', 'CM', 'M']
    let shu = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]
    let sum = 0
    for (let i = 0;i < s.length;i++) {
        if (lou.indexOf(s[i]) >= lou.indexOf(s[i + 1])) {
            sum = sum + shu[lou.indexOf(s[i])]
        } else {
            sum = sum + shu[lou.indexOf(s[i] + s[i + 1])]
            i++
        }
    }
    return sum
};

