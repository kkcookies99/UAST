 var XXX = function(s, numRows) {
    if(numRows >= s.length) return s
    if(numRows === 1) return s
    const res = []
    const length = s.length
    let arr = []
    for(let i = 0; i < length + 1; i++){
        
        if(arr.length === numRows){
            res.push(arr)
            arr = []
        }
        
        if(numRows === 2){
            arr.push(s[i])
            if(i === length - 1 && arr.length < numRows && arr.length > 0){
                res.push(arr)
            }
        }else{
            if((res.length % (numRows - 1)) === 0 && arr.length < numRows){
                arr.push(s[i])
            }
            if((res.length % (numRows - 1))){
                arr = Array(numRows).fill(null)
                arr[arr.length - 1 - (res.length % (numRows - 1))] = s[i]
            }

            if(i === length - 1 && arr.length < numRows && arr.length > 0){
                res.push(arr)
            }
        }
    }

    let str = ''
    for(let i = 0; i < res[0].length; i++){
        for(item of res){
            str += (item[i] || '')
        }
    }
    return str
};

