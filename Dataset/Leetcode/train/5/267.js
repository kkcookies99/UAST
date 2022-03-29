 /**
 * @param {string} s
 * @return {string}
 */
var XXX = function(s) {
    var start = 0; 
    var maxlength = 0;
    var p = []
    for(var i = 0; i < s.length; i++){
        for(var j = 0; j < i + 1; j++){
            if(p[j] === undefined) {
                p[j] = []
            }
            if(i - j < 2){ 
                p[j][i] = s[i] === s[j];
            } else {
                p[j][i] = (p[j + 1][i-1] && s[j] === s[i]); 
            }
            if(p[j][i] && maxlength < i -j + 1) { //判断为回文串且长度大于最大
                start = j;
                maxlength = i -j + 1
            }
        }
    }
    return s.substr(start, maxlength)
};

