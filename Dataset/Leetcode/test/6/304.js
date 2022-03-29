 var XXX = function(s, numRows) {
    
    if(s.length == 1 || numRows == 1)
        return s
    if(s.length <= 2 && numRows < 2)
        return s
    
    let baseArr = new Array()
    
    for(let i = 0; i < numRows; i++) {
        baseArr[i] = new Array();
    }
    
    let length = s.length
    let group = 2 * numRows - 2
    let row
    let col
    let str = ''

    for(let i = 0; i < length; i++) {
        if(i % group < numRows) {
           col = parseInt(i / group) * ( numRows - 1) 
           row = i < group ? i : i % group
           baseArr[row][col] = s.charAt(i)
        }else {
           col = parseInt(i / group) * ( numRows - 1) + i % group - numRows + 1
           row = numRows - 2 - (i < numRows ? i : (i % group -numRows))
           baseArr[row][col] = s.charAt(i) 
        }
    }
    
    for(let i = 0; i < numRows; i++) {
        let itemLength = baseArr[i].length
        for(let j = 0; j < itemLength; j++) {
            str += baseArr[i][j] != undefined ? baseArr[i][j] : ''
        }
    }

    return str
};

