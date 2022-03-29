 /**
 * @param {string} s
 * @return {number}
 */
var XXX = function(s) {
    var ls = s.charAt(0);
    var length = ls.length;
    for(i=1;i <= s.length;i++){
        let index = -1;
        index = ls.indexOf(s.charAt(i))
        if(index > -1){
            length = ls.length > length ? ls.length : length;
            ls = ls.substr(index+1,s.length);
        }
        ls += s.charAt(i);
    }
    return length;
};

