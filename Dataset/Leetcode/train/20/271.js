 var XXX = function(s) {
    let [arr, len, mat] = [[], s.length, {')': '(', ']': '[', '}': '{'}];
    for (let i = 0; i < len; i ++) {
        if (s[i] === '(' || s[i] === '{' || s[i] === '[') {
            arr.push(s[i]);
        } else {
            let item = arr.pop();
            if (item !== mat[s[i]]) {
                return false;
            }
        }    
    }
    if (arr.length !==  0) {
        return false;
    }
    return true;
};

