var XXX = function(l1, l2) {
    let num1 = Number(l1.reverse().join(''))
    let num2 = Number(l2.reverse().join(''))
    let sum = num1 + num2
    let sumArr = sum.toString().split('').reverse()
    let formatSumArr = sumArr.map(item => {
        return Number(item)
    })
    return formatSumArr
}; 

XXX([2,4,3], [5,6,4])

