 var XXX = function(num) {
    var arr = [
        {"key": "M","value": 1000},
        {"key": "CM","value": 900},
        {"key": "D","value": 500},
        {"key": "CD","value": 400},
        {"key": "C","value": 100},
        {"key": "XC","value": 90},
        {"key": "L","value": 50},
        {"key": "XL","value": 40},
        {"key": "X","value": 10},
        {"key": "IX","value": 9},
        {"key": "V","value": 5},
        {"key": "IV","value": 4},
        {"key": "I","value": 1}],returnStr = '',flag = true
    recurFun (num)
    function recurFun (num) {
        arr .forEach(function (item) {
            if (num>=item.value){
                if (flag) {
                    num -=item.value
                    returnStr +=item.key
                    recurFun (num)
                }
                num == 0 ? flag = false : ''
            }
        })
    }
    return returnStr
};

