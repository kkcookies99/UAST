var XXX = function(x) {
    // 问：你能不将整数转为字符串来解决这个问题吗？
    // 答：不能！
    return ((s) => {
        let i = 0
        let j = s.length - 1
        while (j >= i) {
            if (s[i] === s[j]) {
                i ++
                j --
            } else {
                return false
            }
        }
        return true
    })(x.toString());
};

