 var XXX = function(n) {
    let result = []
    let backStacking = (left, right, n , str) => {
        if(left < right || left > n) return
        if(left == right && left == n) {
            result.push(str)
            return
        }
        backStacking(left + 1, right, n, str + '(')
        backStacking(left, right + 1, n,str +  ')')
    }
    backStacking(0,0,n,'')
    return result
};


