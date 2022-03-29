  * @param {string} s
 * @return {number}
 */
var XXX = function(s) {
    if(s=='') return 0
    if(s.length===1) return 1
    let arrStr = s.split('')
    let temp = '';
    let max = 0;
    let cmpMax = 1
    for (let i = 0; i < arrStr.length; i++){
        temp = arrStr[i]
        for (let j = i + 1; j < arrStr.length; j++){
            if (!temp.includes(arrStr[j])) {
                temp = temp + arrStr[j];
                cmpMax = temp.length;
            } else {
                max = Math.max(max, cmpMax)
                temp = ''
                cmpMax = 1
                break
            }
            max = Math.max(max, cmpMax)
        }
    }
    return max
};```
