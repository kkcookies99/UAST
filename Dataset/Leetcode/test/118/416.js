 var XXX = function(numRows) {
    if(numRows == 0) return []
    if(numRows == 1) return [ [1] ]
    let arr = [ [1] ] 
    let sanArr = []
    for(let i = 2;i<=numRows;i++){
        sanArr = []
        for(let j = 0;j<i;j++){
            sanArr[0] = 1
            sanArr[i-1] = 1
            if( j != 0 && j != i-1){
                sanArr[j] = arr[i-2][j-1] + arr[i-2][j]
            }
        }
        arr.push(sanArr)
    }
    return arr
};

