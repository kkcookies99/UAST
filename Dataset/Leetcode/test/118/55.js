 var XXX = function(numRows) {
    let list = []
    let ber = 0
    while(ber<numRows){
        let arr = []
        for(let i = 0;i<=ber;i++){
            if(i == 0|| i == ber){
                arr.push(1)
            }else{
                let left = list[ber - 1][i - 1] || 0
                let right = list[ber - 1][i]
                arr.push(left + right)
            }
        }
        list.push(arr)
        ber++
    }
    return list
};