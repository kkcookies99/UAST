var XXX = function (l1, l2) {
    let ary1 = new Array()
    let ary2 = new Array()
    let ary3 = new Array()
    let newLn = new Object()

    function getArray(ln, ary) {
        while (ln.next !== null) {
            ary.push(ln.val);
            ln = ln.next
        }
        ary.push(ln.val);
        ln.next = null;
    }
    getArray(l1, ary1);
    getArray(l2, ary2);

    function creatListArray(longAry, shortAry, target) {
        let flag = 0
        for (let i = 0; i < longAry.length; i++) {
            if (shortAry[i] == undefined) {
                if (longAry[i] + flag >= 10) {
                    target.push(longAry[i] + flag - 10)
                    flag = 1;
                } else {
                    target.push(longAry[i] + flag)
                    flag = 0
                }
            } else {
                if (longAry[i] + shortAry[i] + flag >= 10) {
                    target.push(longAry[i] + shortAry[i] + flag - 10)
                    flag = 1
                } else {
                    target.push(longAry[i] + shortAry[i] + flag)
                    flag = 0
                }
            }
        }
        if(flag === 1) {
            target.push(1)
        }
    }
    if(ary1.length > ary2.length) {
        creatListArray(ary1, ary2, ary3)
    } else {
        creatListArray(ary2, ary1, ary3)
    }
    ary1 = null;
    ary2 = null;
    function creatList(ary, obj) {
        let target = obj
        ary.forEach(function (item, index) {
            target.val = item
            if (index === ary.length - 1) {
                target.next = null
            } else {
                target.next = new Object()
                target = target.next
            }
        })
    }
    creatList(ary3, newLn)
    return newLn
};

