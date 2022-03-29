var XXX = function (l1, l2) {
            var sum1 = 0
            for (let i = 0; i < l1.length; i++) {
                sum1 += l1[i] * 10 ** i
            }
            var sum2 = 0
            for (let i = 0; i < l2.length; i++) {
                sum2 += l2[i] * 10 ** i
            }
            var sum = sum1 + sum2
            var str = sum.toString()
            var aa = []
            for(let i = str.length - 1; i >= 0; i--) {
                aa.push(str[i])
            }
            return aa
        }

