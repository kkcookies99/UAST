 /**
 * @param {string} s
 * @return {number}
 */
  var XXX = function (s) {
            var temp = []
            var len = []
            if (s.length > 0) {
                for (var i = 0; i < s.length;) {
                    // debugger
                    if (temp.indexOf(s[i]) == -1) {
                        temp.push(s[i])
                        i++
                    } else if (temp.indexOf(s[i]) !== -1) {
                        len.push(temp.length)
                        temp = []
                        i = 0;
                        // console.log(s.indexOf(s[i]))
                        s = s.slice(s.indexOf(s[i]) + 1)
                    }
                    len.push(temp.length)
                }
                return Math.max(...new Set(len))
            } else {
                return 0
            }
        };

