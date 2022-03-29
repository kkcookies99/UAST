 var XXX = function(strs) {
    if (strs.length === 0) {
        return '';
    }
    
    let result = '';
    
    for (let i = 0; i < strs[0].length; i++) {
        const char = strs[0][i];
        
        for (let j = 1; j < strs.length; j++) {
            if (i >= strs[j].length || strs[j][i] !== char) {
                return result;
            }
        }
        
         result += char;
    }
    
    return result;
};