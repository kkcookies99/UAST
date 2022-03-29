 var XXX = function(s, numRows) {
if (numRows === 1) return s
            let n = 0;
            let dir = 1;
            let arr = []
            for (let k of s) {
                if (!arr[n]) arr[n] = ''
                arr[n] += k
                n += dir;
                if (n === 0 || n === numRows - 1) {
                    dir = -dir
                }
            }
            let str = arr.join('')
            return str
};

