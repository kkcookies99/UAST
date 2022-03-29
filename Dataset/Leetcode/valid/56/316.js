 var XXX = function(intervals) {
    const res = []
    function isContain(arr1, arr2) {
        return arr2[0] <= arr1[1] && arr2[1] >= arr1[0] 
    }
    function XXXToRes(arr) {
        if (!res.length) {
            res.push(arr)
            return
        }
        if (arr[1] < res[0][0]) {
            res.unshift(arr)
            return
        }
        if(arr[0] > res[res.length - 1][1]) {
            res.push(arr)
            return
        }
        for (let i = 0; i < res.length; i++) {
            if (isContain(res[i], arr)) {
                arr = [Math.min(res[i][0], arr[0]), Math.max(res[i][1], arr[1])]
                res.splice(i ,1)
                XXXToRes(arr)
                return
            } else if(arr[0] > res[i][1] && arr[1] < res[i+1][0]){
                res.splice(i+1,0,arr)
                return
            }
        }
    }
    intervals.forEach(arr => XXXToRes(arr))
    return res
};

