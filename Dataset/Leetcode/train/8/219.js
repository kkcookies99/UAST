var XXX = function(s) {
    var s = s.trim()
    var flag = 1
    if (s[0] == "-") {
        flag = -1
    } 
    if (s[0] == "-" || (s[0] == "+")) {
        s = s.substr(1,s.length - 1)
    }
    if (s.length == 0) {
        return 0
    }
    var nums = ""
    var result = 0
    for (let c of s) {
        if (isNaN(parseInt(c))) {
            if (nums == "") {
                return 0
            }
            break
        }
        nums += c
    }
    result = parseInt(nums)*flag

    if (result > 2147483647) {
        result = 2147483647
    } else if (result < -2147483648) {
        result = -2147483648
    }
    return result
};

