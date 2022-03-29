 /**
 * @param {string} s
 * @return {string}
 */
var XXX = function(s) {
    if (s.length < 2) return s;
    //中心扩展
    var max = '';
    for (var i = 0; i < s.length; i++) {
        for (var j = 0; j < 2; j++) {
            var left = i;
            var right = i + j;
            while (s[left] && s[left] === s[right]) {
                left--;
                right++;
            }
            //当不为回文串则对当前回文串与上一个回文串进行比较
            //上一回文串(right-1)-(left+1)+1==>right-left-1
            if ((right - left - 1) > max.length) {
                max = s.substring(left + 1, right);
            }
        }
    }
    return max;
};

