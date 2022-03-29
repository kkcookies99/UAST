 var XXX = function(num) {
    const s = ['I','IV','V','IX','X','XL','L','XC','C','CD','D','CM','M']
    const n = [1,4,5,9,10,40,50,90,100,400,500,900,1000]
    let res = ''
    while (num&&s.length) {
        const ss = s.pop(), nn = n.pop()
        const cnt = Math.floor(num/nn)
        res += ss.repeat(cnt)
        num -= nn*cnt
    }
    return res
};

