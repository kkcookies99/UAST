var XXX = function(x1) {
    let x = x1.toString()
    let sign = ''
    if (x.substr(0,1) === '-') {
        sign = '-'
        x = x.slice(1)
    }
    let strList = []
    for (let i = x.length; i --; i >0) {
        strList.push(x[i])
    }
    let str = sign + strList.join('')
    let m = 1
    for (i = 0; i < 31; i++) {
        m *= 2;
    }
    if (Number(str)>0-m   &&  Number(str) <m ) {
        return str;
    } else {
        return 0
    }
};

