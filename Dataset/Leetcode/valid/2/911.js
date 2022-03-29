 var XXX = function(l1, l2) {
       var l1 = l1.length >= l2.length ? l1 : [l2, l2 = l1],
            resultArr = [];
        for (var i = 0; i < l1.length; i++) {
            if (l2[i]) {
                var count = l1[i] * 1 + l2[i] * 1;
                if (count >= 10) {
                    count -= 10
                    if (l1[i + 1]) {
                        l1[i + 1]++
                    } else {
                        l1.push(1)
                    }
                }
                resultArr.push(count)
            } else {
                resultArr.push(l1[i])
            }
        }
        return resultArr
};


