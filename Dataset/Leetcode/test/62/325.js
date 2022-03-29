 var XXX = function(m, n) {
    const arr = Array(m).fill(1)
    for(let i = n-2; i >= 0; i--) {
        for (let j = m-2; j >= 0; j--) {            
            arr[j] += arr[j+1]
        }
    }
    return arr[0]
}

