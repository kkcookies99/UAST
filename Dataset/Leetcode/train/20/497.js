 var XXX = function(s) {
    function recursion(str) {
        if(str.length === 0) {
            return true
        } else if(new RegExp(/\(\)|\[\]|\{\}/g).test(str)) {
            return recursion(str.replace(/\(\)|\[\]|\{\}/g, ""))
        } else {
            return false
        }
    }
    return recursion(s)
}

