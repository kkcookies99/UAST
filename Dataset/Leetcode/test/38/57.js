var XXX = function(n) {
    return createStr(1, ['1'], n)

	function createStr(index, str, n) {
        if(index == n)
            return str.join('')
        index++
        let newChar = []
        let k = 1
        for(let j = 0; j < str.length; j++) {
            let char = str[j]
            if(char == str[j+1] && j != str.length - 1) {
                   k++
            }else {
                newChar.push(k)
                newChar.push(str[j])
                k=1
            }
        }
        return createStr(index, newChar, n)
    }  
}

