 var XXX = function(num) {
    if (num >= 1000) {
        return "M" + XXX(num - 1000)
    }
    if (parseInt(num / 100) == 9) {
        return "CM" + XXX(num - 900)
    }
    if (parseInt(num / 100) == 4) {
        return "CD" + XXX(num - 400)
    }
    if (num >= 500) {
        return "D" + XXX(num - 500)
    }
    if (num >= 100) {
        return "C" + XXX(num - 100)
    }
    if (parseInt(num / 10) == 9) {
        return "XC" + XXX(num - 90)
    }
    if (parseInt(num / 10) == 4) {
        return "XL" + XXX(num - 40)
    }
    if (num >= 50) {
        return "L" + XXX(num - 50)
    }
    if (num >= 10) {
        return "X" + XXX(num - 10) 
    }
    if (num == 9) {
        return "IX"
    }
    if (num == 4) {
        return "IV"
    }
    if (num >= 5) {
        return "V" + XXX(num - 5)
    }
    if (num > 0) {
        return "I" + XXX(num - 1)
    }
    return ""
};

