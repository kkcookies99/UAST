/**
 * @param {string} s
 * @return {number}
 */
var XXX = function(s) {
    let n = s.length? 1: 0;
    let s_ = '';
    for(let i = 0; i < s.length; i ++) {
        for(let j = 0; j < s_.length; j ++) {
            if(s_[j] == s[i]) {
                s_ = s_.substring(j + 1);
                break;
            }
        }
        s_ += s[i];
        n = n > s_.length ? n: s_.length;
    }
    return n;
};

